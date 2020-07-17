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

        val btn_yesq5 = findViewById<View>(R.id.btn_yesq5phone) as Button
        btn_yesq5.setOnClickListener {
            textView_yesq5.setVisibility(View.VISIBLE)
            btn_nextq5phone.setVisibility(View.VISIBLE)
            textView_maybeRice.setVisibility(View.INVISIBLE)
            textView_no.setVisibility(View.INVISIBLE)
        }

        val btn_noq5 = findViewById<View>(R.id.btn_noq5phone) as Button
        btn_noq5.setOnClickListener {
            textView_no.setVisibility(View.VISIBLE)
            textView_maybeRice.setVisibility(View.INVISIBLE)
            textView_yesq5.setVisibility(View.INVISIBLE)
            btn_nextq5phone.setVisibility(View.INVISIBLE)
        }

        val btn_maybeq5 = findViewById<View>(R.id.btn_maybeq5phone) as Button
        btn_maybeq5.setOnClickListener {
            textView_maybeRice.setVisibility(View.VISIBLE)
            textView_yesq5.setVisibility(View.INVISIBLE)
            textView_no.setVisibility(View.INVISIBLE)
            btn_nextq5phone.setVisibility(View.INVISIBLE)
        }

        val btn_nextq5phone = findViewById<View>(R.id.btn_nextq5phone) as Button
        btn_nextq5phone.setOnClickListener {
            val intent = Intent(this, Phone_Question6::class.java)
            startActivity(intent)
        }
    }
}