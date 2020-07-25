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

        btn_yes.setOnClickListener {
            btn_next.setVisibility(View.VISIBLE)
            textView_replyYes.setVisibility(View.VISIBLE)
            text_phoneq4.setVisibility(View.INVISIBLE)
            btn_q4_reset.setVisibility(View.INVISIBLE)
        }

        btn_no.setOnClickListener {
            text_phoneq4.setVisibility(View.VISIBLE)
            textView_replyYes.setVisibility(View.INVISIBLE)
            btn_next.setVisibility(View.INVISIBLE)
            btn_q4_reset.setVisibility(View.VISIBLE)
        }

        btn_next.setOnClickListener {
            val intent = Intent(this, Phone_Question4a::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        btn_q4_reset.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}