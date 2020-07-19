package com.example.help_meit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_phone__question2.*

class Console_Question2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_console__question2)

        val btn_yes = findViewById<View>(R.id.btn_yes) as Button
        btn_yes.setOnClickListener {
            textView_reply_no.setVisibility(View.INVISIBLE)
            btn_next.setVisibility(View.VISIBLE)
        }

        val btn_nxt = findViewById<View>(R.id.btn_next) as Button
        btn_nxt.setOnClickListener {
            val intent = Intent(this, Console_Question3::class.java)
            startActivity(intent)
        }
        val btn_no = findViewById<View>(R.id.btn_no) as Button
        btn_no.setOnClickListener {
            textView_reply_no.setVisibility(View.VISIBLE)
            btn_nxt.setVisibility(View.INVISIBLE)
        }
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}