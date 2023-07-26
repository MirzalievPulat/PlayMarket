package uz.frodo.playmarket

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import uz.frodo.playmarket.databinding.ItemBinding

class MyAdapter(var context:Context,var list: ArrayList<Title>):RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return object :ViewHolder(itemView){}
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.title).text = list[position].title
        holder.itemView.findViewById<RecyclerView>(R.id.rv_inside).adapter = InnerAdapter(list[position].list)
    }
}