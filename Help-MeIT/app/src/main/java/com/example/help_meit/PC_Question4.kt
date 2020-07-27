package com.example.help_meit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_p_c__question4.*

class PC_Question4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p_c__question4)
        setSupportActionBar(findViewById(R.id.toolbar4))
        btn_yesq3.setOnClickListener {
            //"That's all I got"
            btn_nextq3.setVisibility(View.INVISIBLE)
            txt_phoneq3.setVisibility(View.VISIBLE)
            txt_phoneq4.setVisibility(View.INVISIBLE)
            btn_menuq6phone2.setVisibility(View.VISIBLE)
        }

        btn_noq3.setOnClickListener {
            //"Plug it in you nitwit!"
            btn_menuq6phone2.setVisibility(View.INVISIBLE)
            txt_phoneq4.setVisibility(View.VISIBLE)
            txt_phoneq3.setVisibility(View.INVISIBLE)
            btn_nextq3.setVisibility(View.VISIBLE)
        }

        btn_nextq3.setOnClickListener {
            val intent = Intent(this, PC_Question5::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        btn_menuq6phone2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)

        }
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}