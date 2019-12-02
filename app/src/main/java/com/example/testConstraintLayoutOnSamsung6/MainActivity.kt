package com.example.testConstraintLayoutOnSamsung6

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import kotlinx.android.synthetic.main.bottom_sheet_layout.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bottom_sheet_layout)

        GlobalScope.launch(Dispatchers.Main) {
            val context = applicationContext ?: return@launch
            val database =
                Room.databaseBuilder(context, MyDatabase::class.java, "categories.db").build()
            database.categoriesDao().getAll()
            // Bug here, not reproducible at every time with a fresh installation
            // But sometimes
            textView2.visibility = View.GONE
        }

        MyBottomSheetFragment().show(supportFragmentManager, null)
    }
}
