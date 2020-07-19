package com.example.help_meit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_p_c__question2.*

class PC_Question2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p_c__question2)

        btn_yes.setOnClickListener {
            textView_reply_no.setVisibility(View.INVISIBLE)
            btn_next.setVisibility(View.VISIBLE)
        }

        btn_next.setOnClickListener {
            val intent = Intent(this, PC_Question3::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        btn_no.setOnClickListener {
            textView_reply_no.setVisibility(View.VISIBLE)
            btn_next.setVisibility(View.INVISIBLE)
        }
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}