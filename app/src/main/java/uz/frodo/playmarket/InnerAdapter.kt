package uz.frodo.playmarket

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.squareup.picasso.Picasso

class InnerAdapter(var list:ArrayList<App>):RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.inner_item,parent,false)
        return object :ViewHolder(itemView){}
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Picasso.get().load(list[position].imageURL).into(holder.itemView.findViewById<ImageView>(R.id.app_image))
        holder.itemView.findViewById<TextView>(R.id.app_name).text = list[position].name
        holder.itemView.findViewById<TextView>(R.id.app_rating).text = list[position].rating.toString()
    }
}