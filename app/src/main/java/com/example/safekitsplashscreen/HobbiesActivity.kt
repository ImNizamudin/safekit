package com.example.safekitsplashscreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.safekitsplashscreen.R.*

class HobbiesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_hobbies)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        val recyclerView : RecyclerView = findViewById(id.recyclerView)
        recyclerView.layoutManager = layoutManager

        val adapter = HobbiesAdapter(this, Supplier.hobbies)
        recyclerView.adapter = adapter
    }
}