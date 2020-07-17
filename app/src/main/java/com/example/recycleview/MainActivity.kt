package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var horizont: RecyclerView? =null
    private var vertical: RecyclerView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        horizont = findViewById(R.id.horizont)
        vertical = findViewById(R.id.vertical)


        val list1 = arrayListOf<String>()
        for (first in 0 ..100) {
            list1.add("number $first")

        }
        val adapter1 = CustomAdapter(list1)
        horizont?.adapter=adapter1



        val list2 = arrayListOf<SaveModel>()
         for (f in 0..1000)
             list2.add(SaveModel("кайфуй $f","1$f","1000 $f", R.drawable.ic_luft ))


        val adapter2=Adapter2(list2)
        vertical?.adapter=adapter2







    }


}