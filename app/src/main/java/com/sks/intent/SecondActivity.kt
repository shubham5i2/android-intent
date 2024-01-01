package com.sks.intent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        result = findViewById(R.id.result)

        val userName: String = intent.getStringExtra("username").toString()
        val userAge: Int = intent.getIntExtra("userage", 0)

        result.text = "Hi $userName. You are $userAge years old"
    }
}