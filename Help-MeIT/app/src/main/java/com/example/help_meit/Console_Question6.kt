package com.example.help_meit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_console__question2.*
import kotlinx.android.synthetic.main.activity_console__question2.btn_next
import kotlinx.android.synthetic.main.activity_console__question2.btn_next1
import kotlinx.android.synthetic.main.activity_console__question6.*
import kotlinx.android.synthetic.main.activity_phone__question2.*

class Console_Question6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_console__question6)
        setSupportActionBar(findViewById(R.id.toolbar))

        val btn_consoleQ6_1: Button = findViewById<Button>(R.id.btn_consoleQ6_1)
        val btn_consoleQ6_2: Button = findViewById<Button>(R.id.btn_consoleQ6_2)

        btn_consoleQ6_1.setOnClickListener {
            txt_consoleQ6A1.setVisibility(View.VISIBLE)
            txt_consoleQ6A2.setVisibility(View.INVISIBLE)
            btn_menuReturn.setVisibility(View.VISIBLE)
            btn_next.setVisibility(View.INVISIBLE)
        }

        btn_consoleQ6_2.setOnClickListener {
            txt_consoleQ6A2.setVisibility(View.VISIBLE)
            txt_consoleQ6A1.setVisibility(View.INVISIBLE)
            btn_next.setVisibility(View.VISIBLE)
            btn_menuReturn.setVisibility(View.INVISIBLE)
        }

        btn_menuReturn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        btn_next.setOnClickListener {
            val intent = Intent(this, Console_Question7::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}