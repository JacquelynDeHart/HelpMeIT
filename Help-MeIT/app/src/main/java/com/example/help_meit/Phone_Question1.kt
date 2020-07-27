package com.example.help_meit

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_phone__question1.*
import kotlinx.android.synthetic.main.activity_phone__question1.radioGroup


class Phone_Question1 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone__question1)
        setSupportActionBar(findViewById(R.id.toolbar2_pc))
        btn_commit.setOnClickListener {

//logic for radio button selection//
            val id: Int = radioGroup.checkedRadioButtonId
            if (id != -1) { // If any radio button checked from radio group
                if (rbtn_Google.isChecked()) {
                    txt_retort.setVisibility(View.VISIBLE)
                    btn_next.setVisibility(View.VISIBLE)
                    btn_commit.setVisibility(View.INVISIBLE)
                    radioGroup.setVisibility(View.INVISIBLE)
                    textView_samsungPhoneq1.setVisibility(View.INVISIBLE)
                    textView_otherPhoneq1.setVisibility(View.INVISIBLE)
                }
                else if (rbtn_Samsung.isChecked()) {
                    textView_samsungPhoneq1.setVisibility(View.VISIBLE)
                    btn_next.setVisibility(View.VISIBLE)
                    btn_commit.setVisibility(View.INVISIBLE)
                    radioGroup.setVisibility(View.INVISIBLE)
                    txt_retort.setVisibility(View.INVISIBLE)
                    textView_otherPhoneq1.setVisibility(View.INVISIBLE)
                }
                else if (rbtn_Other.isChecked()) {
                    textView_otherPhoneq1.setVisibility(View.VISIBLE)
                    btn_next.setVisibility(View.VISIBLE)
                    btn_commit.setVisibility(View.INVISIBLE)
                    radioGroup.setVisibility(View.INVISIBLE)
                    txt_retort.setVisibility(View.INVISIBLE)
                    textView_samsungPhoneq1.setVisibility(View.INVISIBLE)
                }
            }else
                Toast.makeText(this, "You really have to make a choice", Toast.LENGTH_SHORT).show()
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