package com.example.help_meit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_console__question2.*
import kotlinx.android.synthetic.main.activity_console__question6.*
import kotlinx.android.synthetic.main.activity_console__question6.btn_menuReturn
import kotlinx.android.synthetic.main.activity_console__question6.btn_next1
import kotlinx.android.synthetic.main.activity_console__question7.*

class Console_Question7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_console__question7)

    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}