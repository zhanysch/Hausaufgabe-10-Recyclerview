package com.example.recycleview

import android.content.ClipData
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.vertical_item.view.*

class ViewHolder2 (view2:View):RecyclerView.ViewHolder(view2) {
    fun bind(random:SaveModel){
        itemView.Ttext1.text= random.text1
        itemView.Tsingul.text=random.singul
        itemView.Tnothing.text=random.nothing
        itemView.Iimage2.setBackgroundResource(random.image2)



    }





}