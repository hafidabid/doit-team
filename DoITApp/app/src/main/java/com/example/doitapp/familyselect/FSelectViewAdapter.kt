package com.example.doitapp.familyselect

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FSelectViewAdapter (private val data: ArrayList<FamilyMemberBindingModel>) : RecyclerView.Adapter<HolderFamilyMember>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderFamilyMember {
        val ifl = LayoutInflater.from(parent.context)
        return HolderFamilyMember(ifl, parent)
    }

    override fun onBindViewHolder(holder: HolderFamilyMember, position: Int) {
        print(data[position].name)
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}