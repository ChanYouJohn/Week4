package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnCall = findViewById<Button>(R.id.btnCall)
        var btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener(){
            val intent = Intent(this, NextActivity::class.java)
            intent.putExtra("personName", "John")
            startActivity(intent)
        }

        btnCall.setOnClickListener(){

            val value = Uri.parse("geo:3.1466, 101.6958")
            val intent = Intent(Intent.ACTION_VIEW, value)
            startActivity(intent)
        }
    }
}