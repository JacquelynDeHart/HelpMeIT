package com.example.help_meit

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_phone_question4a.*
import kotlinx.android.synthetic.main.activity_phone_question4a_2.*

class Phone_Question4a_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_question4a_2)

        btn_Q4a_2_yes.setOnClickListener {
            textView_Q4a_2_yes.setVisibility(View.VISIBLE)
            textView_Q4a_2_no.setVisibility(View.INVISIBLE)

        }

        btn_Q4a_2_no.setOnClickListener {
            textView_Q4a_2_no.setVisibility(View.VISIBLE)
            textView_Q4a_2_yes.setVisibility(View.INVISIBLE)

        }

        btn_Q4a2_to4b.setOnClickListener {
            val intent = Intent(this, Phone_Question4b::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}