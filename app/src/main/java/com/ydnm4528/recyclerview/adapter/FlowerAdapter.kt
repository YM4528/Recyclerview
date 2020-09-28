package com.ydnm4528.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ydnm4528.recyclerview.R
import com.ydnm4528.recyclerview.model.Flower
import kotlinx.android.synthetic.main.item_flower.view.*


class FlowerAdapter(var flowerList: ArrayList<Flower>) :
    RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder>() {

    class FlowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(flower: Flower) {
            itemView.txtname.text = flower.name
            itemView.txtPrie.text = flower.price.toString()
            itemView.imgFlowser.setImageResource(flower.image)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_flower, parent, false)
        return FlowerViewHolder(view)
    }

    override fun getItemCount(): Int = flowerList.size

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {

        holder.bind(flowerList[position])
    }




}