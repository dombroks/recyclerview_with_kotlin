package com.example.recyclerviewwithkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class Adapter (private  val items : List<item> ): RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false) ;
        return ViewHolder(view);
    }

    override fun getItemCount()=items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val mItem=items[position]
        holder.itemName.text = mItem.itemName
        holder.itemDecs.text=mItem.itemDesciption
    }
    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.imageView
        val itemName : TextView = itemView.itemName
        val itemDecs : TextView = itemView.itemDesc

    }


}