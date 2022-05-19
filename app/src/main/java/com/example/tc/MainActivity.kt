package com.example.tc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        lateinit var start : Button
        start = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.startbutton)

        start.setOnClickListener();

    }
}

private fun Button.setOnClickListener() {
    TODO("Not yet implemented")
    //var intent = Intent(this,activity_login)
}



