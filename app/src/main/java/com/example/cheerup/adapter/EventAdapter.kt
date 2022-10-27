package com.example.cheerup.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cheerup.R
import com.example.cheerup.models.Event
import kotlinx.android.synthetic.main.event_list.view.*


class EventAdapter(val events: List<Event>): RecyclerView.Adapter<EventAdapter.ItemViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
             LayoutInflater.from(parent.context)
            .inflate(R.layout.event_list, parent, false))
    }

    override fun onBindViewHolder(holder:  ItemViewHolder, position: Int) {

        val event = events[position]
        holder.view.txtName.text = event.title
        holder.view.txtCity.text = event.type
        Glide.with(holder.view.context).load(event.image).into(holder.view.eventImage)




    }

    override fun getItemCount():Int{

        return events.size
    }


    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view)



}