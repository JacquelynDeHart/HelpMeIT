package com.example.help_meit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class Phone_Question1MakeModel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone__question1_make_model)

        val btn_commit = findViewById<View>(R.id.btn_commit) as Button
        btn_commit.setOnClickListener {
            val intent = Intent(this, Phone_Question2::class.java)
            startActivity(intent)
        }

    }

}