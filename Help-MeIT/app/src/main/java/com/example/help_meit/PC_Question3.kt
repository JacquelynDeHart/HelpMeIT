package com.example.help_meit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_p_c__question3.*

class PC_Question3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p_c__question3)

        btn_yesq3.setOnClickListener {
            btn_nextq3.setVisibility(View.VISIBLE)
            txt_phoneq3.setVisibility(View.INVISIBLE)
        }

        btn_noq3.setOnClickListener {
            txt_phoneq3.setVisibility(View.VISIBLE)
            btn_nextq3.setVisibility(View.INVISIBLE)
        }

        btn_nextq3.setOnClickListener {
            val intent = Intent(this, PC_Question4::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}