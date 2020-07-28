package com.example.help_meit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_console__question3.*

class Console_Question3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_console__question3)
        setSupportActionBar(findViewById(R.id.toolbar))
        btn_consoleQ3_1.setOnClickListener {
            txt_consoleQ3A1.setVisibility(View.VISIBLE)
            txt_consoleQ3A2.setVisibility(View.INVISIBLE)
            btn_next.setVisibility(View.INVISIBLE)
            btn_menuReturn.setVisibility(View.VISIBLE)
        }

        btn_consoleQ3_2.setOnClickListener {
            txt_consoleQ3A2.setVisibility(View.VISIBLE)
            txt_consoleQ3A1.setVisibility(View.INVISIBLE)
            btn_next.setVisibility(View.VISIBLE)
            btn_menuReturn.setVisibility(View.INVISIBLE)
        }

        btn_menuReturn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        btn_next.setOnClickListener {
            val intent = Intent(this, Console_Question8::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}