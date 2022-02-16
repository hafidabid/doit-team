package com.example.doitapp.dream.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.doitapp.club.home.PopularHolder
import com.example.doitapp.club.home.PopularModel

class DreamAdapter(private val data: ArrayList<DreamData>) : RecyclerView.Adapter<DreamHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DreamHolder {
        val ifl = LayoutInflater.from(parent.context)
        return DreamHolder(ifl, parent)
    }

    override fun onBindViewHolder(holder: DreamHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}