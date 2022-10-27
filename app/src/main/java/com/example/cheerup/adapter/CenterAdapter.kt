package com.example.cheerup.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cheerup.R
import com.example.cheerup.models.Center
import kotlinx.android.synthetic.main.center_list.view.*
import kotlinx.android.synthetic.main.event_list.view.*
import kotlinx.android.synthetic.main.event_list.view.txtCity
import kotlinx.android.synthetic.main.event_list.view.txtName

class CenterAdapter(val centers: List<Center>): RecyclerView.Adapter<CenterAdapter.ItemViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.center_list, parent, false))
    }

    override fun onBindViewHolder(holder:  ItemViewHolder, position: Int) {

        val center = centers[position]
        holder.view.txtName.text = center.name
        holder.view.txtCity.text = center.city
        Glide.with(holder.view.context).load(center.image).into(holder.view.centerImage)


    }

    override fun getItemCount():Int{

        return centers.size
    }


    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view)



}