package com.example.recycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter2(private val array2:ArrayList<SaveModel>):RecyclerView.Adapter<ViewHolder2>() {

    override fun onCreateViewHolder(parent2: ViewGroup, viewType: Int): ViewHolder2 {
        val view2 = LayoutInflater.from(parent2.context).inflate(R.layout.vertical_item,parent2,false)
        val holder = ViewHolder2(view2)
        return holder

    }

    override fun getItemCount(): Int {
        return array2.size


    }

    override fun onBindViewHolder(holder2: ViewHolder2, position: Int) {

        val random =array2[position]
        holder2.bind(random)


    }

}
