package com.example.recycleview

import android.view.View
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.horizont_item.view.*
import kotlinx.android.synthetic.main.vertical_item.view.*

class ViewHolder(view:View):RecyclerView.ViewHolder(view) {



    fun fullit(qwerty: String){

        itemView.light.text=qwerty

    }

}