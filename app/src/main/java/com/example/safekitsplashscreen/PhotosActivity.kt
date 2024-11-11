package com.example.safekitsplashscreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PhotosActivity: AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<ImagesModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_images)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)

        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter

        dataList.add(ImagesModel("Title 1", "Img1", R.drawable.logo1))
        dataList.add(ImagesModel("Title 2", "Img2", R.drawable.logo2))
        dataList.add(ImagesModel("Title 3", "Img3", R.drawable.mainpageimg))
        dataList.add(ImagesModel("Title 4", "Img4", R.drawable.signupimg))

        photoAdapter.setDataList(dataList)
    }
}