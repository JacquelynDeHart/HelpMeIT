package com.example.help_meit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_phone__question6.*

class Phone_Question6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone__question6)

        val btn_yesq6phone = findViewById<View>(R.id.btn_yesq6phone) as Button
        btn_yesq6phone.setOnClickListener {
            textView_yesq6phone.setVisibility(View.VISIBLE)
            btn_menuq6phone.setVisibility(View.VISIBLE)
            textView_noq6phone.setVisibility(View.INVISIBLE)
        }

        val btn_noq6phone = findViewById<View>(R.id.btn_noq6phone) as Button
        btn_noq6phone.setOnClickListener {
            textView_noq6phone.setVisibility(View.VISIBLE)
            textView_yesq6phone.setVisibility(View.INVISIBLE)
        }

        val btn_menuq6phone = findViewById<View>(R.id.btn_menuq6phone) as Button
        btn_menuq6phone.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)

        }
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}