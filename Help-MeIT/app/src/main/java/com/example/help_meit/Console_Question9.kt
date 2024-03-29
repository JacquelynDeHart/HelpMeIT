package com.example.help_meit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_console__question9.*

class Console_Question9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_console__question9)
        setSupportActionBar(findViewById(R.id.toolbar))

        btn_consoleQ9_1.setOnClickListener {
            txt_consoleQ9A1.setVisibility(View.VISIBLE)
            txt_consoleQ9A2.setVisibility(View.INVISIBLE)
            btn_menuReturn.setVisibility(View.VISIBLE)
        }

        btn_consoleQ9_2.setOnClickListener {
            txt_consoleQ9A2.setVisibility(View.VISIBLE)
            txt_consoleQ9A1.setVisibility(View.INVISIBLE)
            btn_menuReturn.setVisibility(View.VISIBLE)
        }

        btn_menuReturn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}