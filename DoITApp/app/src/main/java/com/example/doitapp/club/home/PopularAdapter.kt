package com.example.doitapp.club.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.doitapp.familyselect.FamilyMemberBindingModel
import com.example.doitapp.familyselect.HolderFamilyMember

class PopularAdapter (private val data: ArrayList<PopularModel>) : RecyclerView.Adapter<PopularHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularHolder {
        val ifl = LayoutInflater.from(parent.context)
        return PopularHolder(ifl, parent)
    }

    override fun onBindViewHolder(holder: PopularHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}