package com.example.doitapp.club.home

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.doitapp.R

class PopularHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.card_club_lessons_popular, parent, false)) {

        lateinit var courseTitle : TextView
        lateinit var courseThumbnail : ImageView
        lateinit var courseAuthor : TextView
        lateinit var courseButton: Button
        lateinit var parent: ViewGroup
        init {
            courseTitle = itemView.findViewById(R.id.textView11)
            courseAuthor = itemView.findViewById(R.id.textView12)
            courseThumbnail = itemView.findViewById(R.id.imageView5)
            courseButton = itemView.findViewById(R.id.button2)
            this.parent = parent
        }

        fun bind(data: PopularModel){
            courseTitle.text = data.name.toString()
            courseAuthor.text = data.author.toString()
            courseButton.setOnClickListener{
                Toast.makeText(this.parent.context,"Ini akan mengarah ke "+courseTitle.text, Toast.LENGTH_LONG).show()
            }
        }
}