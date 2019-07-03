package com.eslam.cicapp.activity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.eslam.mybottomnavigationapp.HomeFragment
import com.eslam.mybottomnavigationapp.R

class NamesAdapter(val context: HomeFragment, val items: List<String>):RecyclerView.Adapter<NamesAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.itemt_row,parent,false)
        )

    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.firstName.text=items[position]
    }

    class MyViewHolder(val view : View)  : RecyclerView.ViewHolder(view){


        val firstName = view.findViewById(R.id.tvFirstName) as TextView
        val lastName = view.findViewById(R.id.tvLastName) as TextView

    }
}