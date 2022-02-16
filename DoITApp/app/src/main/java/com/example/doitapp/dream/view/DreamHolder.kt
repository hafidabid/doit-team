package com.example.doitapp.dream.view

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.doitapp.R

class DreamHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.card_my_dream, parent, false))  {

        lateinit var targetDate: TextView
        lateinit var dreamTitle: TextView
        lateinit var dreamBudget: TextView
        lateinit var gambar: ImageView
        init {
            targetDate = itemView.findViewById(R.id.textView40)
            dreamTitle = itemView.findViewById(R.id.textView10)
            dreamBudget = itemView.findViewById(R.id.textView41)
            gambar = itemView.findViewById(R.id.imageView47)
        }

        fun bind(data: DreamData){
            targetDate.text = data.dateTarget
            dreamTitle.text = data.title
            dreamBudget.text = data.money.toString()
            gambar.setImageResource(R.drawable.boy_2)
        }
}