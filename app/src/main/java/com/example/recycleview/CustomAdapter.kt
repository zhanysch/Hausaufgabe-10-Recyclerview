package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val array: ArrayList<String>): RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.horizont_item, parent, false)
        val hold = ViewHolder(view)
        return hold



    }

    override fun getItemCount(): Int {
        return array.size


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val qwerty = array[position]
        holder.fullit(qwerty)




    }
}


