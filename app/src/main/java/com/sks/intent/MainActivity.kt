package com.sks.intent

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var age: EditText
    private lateinit var send: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Message", "onCreate")

        name = findViewById(R.id.editTextName)
        age = findViewById(R.id.editTextAge)
        send = findViewById(R.id.button)

        send.setOnClickListener {

            val userName: String = name.text.toString()
            val userAge: Int = age.text.toString().toInt()

            val intent = Intent(this@MainActivity, SecondActivity::class.java)

            intent.putExtra("username", userName)
            intent.putExtra("userage", userAge)

            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "onDestroy")
    }
}