package com.example.help_meit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.content.Intent
import android.os.Build
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.view.isVisible
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_p_c_question1.*

class PC_Question1 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p_c_question1)

        btn_next.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btn_commit.setOnClickListener {
            // Get the checked radio button id from radio group
            val id: Int = radioGroup.checkedRadioButtonId
            if (id != -1) { // If any radio button checked from radio group
                if (rbtn_Google.isChecked() || rbtn_hp.isChecked()) {
                    val intent = Intent(this, PC_Question2::class.java)
                    startActivity(intent)
                } else if (rbtn_Other.isChecked()) {
                    txt_retort.setVisibility(View.VISIBLE)
                    btn_next.setVisibility(View.VISIBLE)
                    radioGroup.setVisibility(View.INVISIBLE)
                }
            }
        }
    }
}
