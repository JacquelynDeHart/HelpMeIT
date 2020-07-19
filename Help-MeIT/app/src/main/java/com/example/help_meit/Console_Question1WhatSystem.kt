package com.example.help_meit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_console__question1_what_system.*
import kotlinx.android.synthetic.main.activity_p_c_question1.*
import kotlinx.android.synthetic.main.activity_p_c_question1.btn_commit
import kotlinx.android.synthetic.main.activity_p_c_question1.radioGroup

class Console_Question1WhatSystem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_console__question1_what_system)

        btn_nextc1.setOnClickListener{
            val intent = Intent(this, Console_Question2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        btn_selectc1.setOnClickListener {
            // Get the checked radio button id from radio group
            val id: Int = radioGroup.checkedRadioButtonId
            if (id != -1) { // If any radio button checked from radio group
                if (rbtn_xbox.isChecked()) {
                    txt_q1_xbox.setVisibility(View.VISIBLE)
                    txt_xbox_select.setVisibility(View.VISIBLE)
                    btn_nextc1.setVisibility(View.VISIBLE)
                    btn_selectc1.setVisibility(View.INVISIBLE)
                    radioGroup.setVisibility(View.VISIBLE)
                }
                else if (rbtn_playstation.isChecked()) {
                    txt_q1_playstation.setVisibility(View.VISIBLE)
                    txt_ps_select.setVisibility(View.VISIBLE)
                    btn_nextc1.setVisibility(View.VISIBLE)
                    btn_selectc1.setVisibility(View.INVISIBLE)
                    radioGroup.setVisibility(View.VISIBLE)
                }
                else if (rbtn_switch.isChecked()) {
                    txt_q1_switch.setVisibility(View.VISIBLE)
                    txt_switch_select.setVisibility(View.VISIBLE)
                    btn_nextc1.setVisibility(View.VISIBLE)
                    btn_selectc1.setVisibility(View.INVISIBLE)
                    radioGroup.setVisibility(View.VISIBLE)
                }
            }
        }
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}