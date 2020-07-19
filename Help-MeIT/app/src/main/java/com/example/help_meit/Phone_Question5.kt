package com.example.help_meit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_phone__question5.*

class Phone_Question5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone__question5)

        btn_yesq5phone.setOnClickListener {
            textView_yesq5.setVisibility(View.VISIBLE)
            btn_nextq5phone.setVisibility(View.VISIBLE)
            textView_maybeRice.setVisibility(View.INVISIBLE)
            textView_no.setVisibility(View.INVISIBLE)
        }

        btn_noq5phone.setOnClickListener {
            textView_no.setVisibility(View.VISIBLE)
            textView_maybeRice.setVisibility(View.INVISIBLE)
            textView_yesq5.setVisibility(View.INVISIBLE)
            btn_nextq5phone.setVisibility(View.INVISIBLE)
        }

        btn_maybeq5phone.setOnClickListener {
            textView_maybeRice.setVisibility(View.VISIBLE)
            textView_yesq5.setVisibility(View.INVISIBLE)
            textView_no.setVisibility(View.INVISIBLE)
            btn_nextq5phone.setVisibility(View.INVISIBLE)
        }

        btn_nextq5phone.setOnClickListener {
            val intent = Intent(this, Phone_Question6::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}