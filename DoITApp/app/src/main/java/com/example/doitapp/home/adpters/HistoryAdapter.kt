package com.example.doitapp.home.adpters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.doitapp.club.home.PopularHolder
import com.example.doitapp.club.home.PopularModel

class HistoryAdapter(private val data: ArrayList<HistoryModel>) : RecyclerView.Adapter<HistoryHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryHolder {
        val ifl = LayoutInflater.from(parent.context)
        return HistoryHolder(ifl, parent)
    }

    override fun onBindViewHolder(holder: HistoryHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}