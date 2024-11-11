package com.example.safekitsplashscreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ImagesActivity : AppCompatActivity() {
        private lateinit var recyclerView: RecyclerView
        private lateinit var imagesAdapter: ImagesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_images)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        val images = listOf(
            "https://ipcisco.com/wp-content/uploads/OSPF_Area_Types_3_.jpg",
            "https://ipcisco.com/wp-content/uploads/OSPF/ospf_area_types2.jpg"
        )

        val adapter = ImagesAdapter(this, images)
        recyclerView.adapter = adapter
    }
}