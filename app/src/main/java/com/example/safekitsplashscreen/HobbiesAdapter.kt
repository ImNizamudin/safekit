package com.example.safekitsplashscreen

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class HobbiesAdapter(val context: Context, val hobbies : List<Hobby>) : RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby, position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var curretHobby : Hobby? = null
        var curentPosition : Int = 0
        val imgShare: ImageView = itemView.findViewById(R.id.imgShare)
        val txvTitle: TextView = itemView.findViewById(R.id.txvTitle)

        init {
            itemView.setOnClickListener {
                Toast.makeText(context, curretHobby!!.title + " Clicked !", Toast.LENGTH_SHORT).show()
            }

            imgShare.setOnClickListener {
                val message: String = "My Hobby is : " + curretHobby!!.title

                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, message)
                intent.type = "text/plain"
                context.startActivity(Intent.createChooser(intent, "Share to : "))
            }
        }

        fun setData(hobby: Hobby?, pos: Int) {
            txvTitle.text = hobby!!.title
            this.curretHobby = hobby
            this.curentPosition = pos
        }
    }
}