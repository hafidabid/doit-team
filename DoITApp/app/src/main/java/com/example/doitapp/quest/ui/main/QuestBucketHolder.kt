package com.example.doitapp.quest.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.doitapp.R

class QuestBucketHolder (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.card_quest_items, parent, false)) {

        lateinit var cb : CheckBox
        lateinit var pts : TextView
        init {
            cb = itemView.findViewById(R.id.checkBox)
            pts = itemView.findViewById(R.id.textView21)
        }

        fun bind(data: QuestBucketModel){
            cb.text = data.title
            pts.text = "${data.poin} Points"
        }
}