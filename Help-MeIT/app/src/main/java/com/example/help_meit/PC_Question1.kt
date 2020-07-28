package com.example.help_meit

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_p_c__question1.*

class PC_Question1 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p_c__question1)
        setSupportActionBar(findViewById(R.id.toolbar2_pc))

        btn_return.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        btn_next.setOnClickListener{
            val intent = Intent(this, PC_Question2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        btn_commit.setOnClickListener {
            // Get the checked radio button id from radio group
            val id: Int = radioGroup.checkedRadioButtonId
            if (id != -1) { // If any radio button checked from radio group
                if (rbtn_windows.isChecked()) {
                    btn_commit.setVisibility(View.INVISIBLE)
                    radioGroup.setVisibility(View.INVISIBLE)

                    txt_windows_select.setVisibility(View.VISIBLE)
                    btn_next.setVisibility(View.VISIBLE)
                    txt_retort_windows.setVisibility(View.VISIBLE)
                } else if (rbtn_mac.isChecked()) {
                    btn_commit.setVisibility(View.INVISIBLE)
                    radioGroup.setVisibility(View.INVISIBLE)

                    txt_mac_select.setVisibility(View.VISIBLE)
                    txt_retort_mac.setVisibility(View.VISIBLE)
                    btn_return.setVisibility(View.VISIBLE)
                } else if (rbtn_linux.isChecked()){
                    btn_commit.setVisibility(View.INVISIBLE)
                    radioGroup.setVisibility(View.INVISIBLE)

                    txt_linux_select.setVisibility(View.VISIBLE)
                    btn_next.setVisibility(View.VISIBLE)
                    txt_retort_linux.setVisibility(View.VISIBLE)
                } else if (rbtn_other.isChecked()){
                    btn_commit.setVisibility(View.INVISIBLE)
                    radioGroup.setVisibility(View.INVISIBLE)

                    txt_other_select.setVisibility(View.VISIBLE)
                    btn_next.setVisibility(View.VISIBLE)
                    txt_retort_other.setVisibility(View.VISIBLE)
                }
            }
        }
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}
