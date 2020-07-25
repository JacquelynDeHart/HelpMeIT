package com.example.help_meit

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_phone_question4a.*

class Phone_Question4a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_question4a)

        btn_q4a_toQ4b.setVisibility(View.INVISIBLE)
        textView_Q4a_yes.setVisibility(View.INVISIBLE)
        textView_Q4a_no.setVisibility(View.INVISIBLE)
        btn_q4Next.setVisibility(View.INVISIBLE)

        btn_phoneQ4a_yes.setOnClickListener {
            btn_q4a_toQ4b.setVisibility(View.VISIBLE)
            textView_Q4a_yes.setVisibility(View.VISIBLE)
            textView_Q4a_no.setVisibility(View.INVISIBLE)
            btn_q4Next.setVisibility(View.INVISIBLE)
        }

        btn_phoneQ4a_no.setOnClickListener {
            btn_q4a_toQ4b.setVisibility(View.GONE)
            textView_Q4a_yes.setVisibility(View.INVISIBLE)
            textView_Q4a_no.setVisibility(View.VISIBLE)
            btn_q4Next.setVisibility(View.VISIBLE)
        }

        btn_q4Next.setOnClickListener {
            val intent = Intent(this, Phone_Question6::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        btn_q4a_toQ4b.setOnClickListener {
            val intent = Intent(this, Phone_Question4a_2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}