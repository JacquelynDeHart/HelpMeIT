package com.example.help_meit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_console__question2.*
import kotlinx.android.synthetic.main.activity_p_c__question2.*
import kotlinx.android.synthetic.main.activity_phone__question2.*
import kotlinx.android.synthetic.main.activity_phone__question2.btn_next
import kotlinx.android.synthetic.main.activity_phone__question2.btn_yes
import kotlinx.android.synthetic.main.activity_phone__question2.textView_reply_no

class Console_Question2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_console__question2)

        btn_consoleQ2_1.setOnClickListener {
            txt_consoleA1.setVisibility(View.VISIBLE)
            txt_consoleA2.setVisibility(View.INVISIBLE)
            btn_next.setVisibility(View.VISIBLE)
        }

        btn_consoleQ2_2.setOnClickListener {
            txt_consoleA2.setVisibility(View.VISIBLE)
            txt_consoleA1.setVisibility(View.INVISIBLE)
            btn_next.setVisibility(View.VISIBLE)
        }

        btn_next.setOnClickListener {
            val intent = Intent(this, Console_Question3::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}