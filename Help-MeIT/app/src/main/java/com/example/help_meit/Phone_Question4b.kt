package com.example.help_meit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_phone_question4b.*

class Phone_Question4b : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val number = intent.getIntExtra("number", 0)
        setContentView(R.layout.activity_phone_question4b)

        btn_Q4b_next.setOnClickListener {
            if(number <1){
                val intent = Intent(this, Phone_Question5::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            }
            else if(number >1){
                val intent = Intent(this, Phone_Question6::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            }else
                Toast.makeText(this, "Something wrong from q4a_2", Toast.LENGTH_SHORT).show()


        }
        btn_Q4b_yes.setOnClickListener {
            textView_Q4b_yes.setVisibility(View.VISIBLE)
            textView_Q4b_no.setVisibility(View.INVISIBLE)
            btn_Q4b_next.setVisibility(View.VISIBLE)
            btn_Q4b_toMenu.setVisibility(View.INVISIBLE)
        }

        btn_Q4b_no.setOnClickListener {
            textView_Q4b_no.setVisibility(View.VISIBLE)
            textView_Q4b_yes.setVisibility(View.INVISIBLE)
            btn_Q4b_next.setVisibility(View.INVISIBLE)
            btn_Q4b_toMenu.setVisibility(View.VISIBLE)
        }

        btn_Q4b_toMenu.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}