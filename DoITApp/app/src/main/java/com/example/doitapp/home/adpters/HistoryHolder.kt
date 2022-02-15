package com.example.doitapp.home.adpters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.doitapp.R

class HistoryHolder (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.card_catat_history, parent, false)) {

        lateinit var iconImg: ImageView
        lateinit var histTitle: TextView
        lateinit var histDetail: TextView
        lateinit var ammount: TextView

        val imageList = arrayOf<Int>(R.drawable.history_health, R.drawable.history_income, R.drawable.history_makan, R.drawable.history_market)

        init {
            iconImg = itemView.findViewById(R.id.imageView5)
            histTitle = itemView.findViewById(R.id.textView11)
            histDetail = itemView.findViewById(R.id.textView12)
            ammount = itemView.findViewById(R.id.textView35)
        }

        fun bind(data: HistoryModel){
            histTitle.text = data.title
            histDetail.text = data.desc
            ammount.text = "Rp${data.price}"
            iconImg.setImageResource(imageList[data.icon%imageList.size])
        }
}