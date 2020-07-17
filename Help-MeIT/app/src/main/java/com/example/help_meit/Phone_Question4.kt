package com.example.help_meit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_phone__question4.*

class Phone_Question4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone__question4)

        val btn_yesq4 = findViewById<View>(R.id.btn_yes) as Button
        btn_yesq4.setOnClickListener {
            btn_next.setVisibility(View.VISIBLE)
            text_phoneq4.setVisibility(View.INVISIBLE)
        }

        val btn_noq4 = findViewById<View>(R.id.btn_no) as Button
        btn_noq4.setOnClickListener {
            text_phoneq4.setVisibility(View.VISIBLE)
            btn_next.setVisibility(View.INVISIBLE)
        }

        val btn_nextq4 = findViewById<View>(R.id.btn_next) as Button
        btn_nextq4.setOnClickListener {
            val intent = Intent(this, Phone_Question5::class.java)
            startActivity(intent)
        }
    }
}