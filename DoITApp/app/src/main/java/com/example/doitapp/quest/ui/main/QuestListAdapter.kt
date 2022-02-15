package com.example.doitapp.quest.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.doitapp.familyselect.FamilyMemberBindingModel
import com.example.doitapp.familyselect.HolderFamilyMember

class QuestListAdapter(private val data: ArrayList<QuestBucketModel>) : RecyclerView.Adapter<QuestBucketHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestBucketHolder {
        val ifl = LayoutInflater.from(parent.context)
        return QuestBucketHolder(ifl, parent)
    }

    override fun onBindViewHolder(holder: QuestBucketHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

}