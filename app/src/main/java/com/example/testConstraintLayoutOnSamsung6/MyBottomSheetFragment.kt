package com.example.testConstraintLayoutOnSamsung6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.room.Room
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottom_sheet_layout.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MyBottomSheetFragment : BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.bottom_sheet_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        Handler().postDelayed({
//            textView.visibility = View.GONE
//            pager.visibility = View.GONE
//            lineaLayout.visibility = View.GONE
//        }, 2000)

        GlobalScope.launch(Dispatchers.Main) {

            val context = context?:return@launch
            val database = Room.databaseBuilder(context, MyDatabase::class.java, "categories.db").build()
            database.categoriesDao().getAll()

            //delay(TimeUnit.SECONDS.toMillis(5))
            //textView.visibility = View.GONE
            //pager.visibility = View.GONE
            //pagerInsideLinearLayout.visibility = View.GONE
            textView2.visibility = View.GONE
        }
    }
}