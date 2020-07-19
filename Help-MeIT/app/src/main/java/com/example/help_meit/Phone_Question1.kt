package com.example.help_meit

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_phone__question1.*


class Phone_Question1 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone__question1)

        btn_commit.setOnClickListener {
            txt_retort.setVisibility(View.VISIBLE)
            btn_next.setVisibility(View.VISIBLE)
            radioGroup.setVisibility(View.INVISIBLE)
        }

        btn_next.setOnClickListener {
            val intent = Intent(this, Phone_Question2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}