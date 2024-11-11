package com.example.safekitsplashscreen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        val btnShowToast = findViewById<Button>(R.id.btnShowToast)
//        btnShowToast.setOnClickListener {
//            Log.i("MainActivity", "Button Was Clicked")
//            Toast.makeText(this, "Button Was Clicked", Toast.LENGTH_SHORT).show()
//        }
//
//        findViewById<Button>(R.id.btnSendMsgToNextActivity)
//            .setOnClickListener{
//                val message = findViewById<TextView>(R.id.etUserMessage).text.toString()
//
//                val intent = Intent(this, SecondActivity::class.java)
//                intent.putExtra("user_message", message)
//                startActivity(intent)
//            }
//
//        findViewById<Button>(R.id.btnShareToOtherApps)
//            .setOnClickListener{
//                val message = findViewById<TextView>(R.id.etUserMessage).text.toString()
//
//                val intent = Intent()
//                intent.action = Intent.ACTION_SEND
//                intent.putExtra(Intent.EXTRA_TEXT, message)
//                intent.type = "text/plain"
//                startActivity(Intent.createChooser(intent, "Share to : "))
//            }
//
//        findViewById<Button>(R.id.btnRecycleViewDemo)
//            .setOnClickListener{
//                val intent = Intent(this, HobbiesActivity::class.java)
//                startActivity(intent)
//            }
        findViewById<Button>(R.id.btnRecycleViewDemo)
            .setOnClickListener{
                val intent = Intent(this, PhotosActivity::class.java)
                startActivity(intent)
            }
    }
}