package com.example.recyclerviewwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview.adapter=Adapter(createDummyData(50))
        recyclerview.setHasFixedSize(true)
        recyclerview.layoutManager=LinearLayoutManager(this)

    }
    private fun createDummyData(size : Int) : List<item>{
        val items = ArrayList<item>()
        for (i in 0..size){
            val mItem = item("Item number $i","description of item number $i")
            items.add(mItem)
        }
        return  items
    }
}