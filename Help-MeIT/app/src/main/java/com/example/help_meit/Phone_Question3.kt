package com.example.help_meit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_phone__question3.*

class Phone_Question3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone__question3)

        val btn_yesq3 = findViewById<View>(R.id.btn_yesq3) as Button
        btn_yesq3.setOnClickListener {
            btn_nextq3.setVisibility(View.VISIBLE)
        }

        val btn_noq3 = findViewById<View>(R.id.btn_noq3) as Button
        btn_noq3.setOnClickListener {
            txt_phoneq3.setVisibility(View.VISIBLE)
            btn_nextq3.setVisibility(View.INVISIBLE)
        }

        val btn_nextq3 = findViewById<View>(R.id.btn_nextq3) as Button
        btn_nextq3.setOnClickListener {
            val intent = Intent(this, Phone_Question4::class.java)
            startActivity(intent)
        }
    }
}