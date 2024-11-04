package com.example.safekitsplashscreen

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.safekitsplashscreen.R.*

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_second)

        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("user_message")

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        findViewById<TextView>(id.txtUserMessage).text = msg
    }
}