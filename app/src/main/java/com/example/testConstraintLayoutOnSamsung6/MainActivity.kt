package com.example.testConstraintLayoutOnSamsung6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MyBottomSheetFragment().show(supportFragmentManager, null)
    }
}
