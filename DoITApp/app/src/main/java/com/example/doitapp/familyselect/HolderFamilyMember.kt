package com.example.doitapp.familyselect

import android.app.AlertDialog
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.doitapp.R
import com.example.doitapp.databinding.CardFamilyOnWelcomeBinding
import com.example.doitapp.home.HomeActivity

class HolderFamilyMember (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.card_family_on_welcome, parent, false))
{
        lateinit var holderView : CardFamilyOnWelcomeBinding
        lateinit var userImage : ImageView
        lateinit var memberName : TextView
        lateinit var p: ViewGroup
        val imageList = arrayOf<Int>(R.drawable.boy_1, R.drawable.boy_2, R.drawable.girl_1, R.drawable.girl_2)
        init {
            //holderView = CardFamilyOnWelcomeBinding.inflate(inflater)
            userImage = itemView.findViewById(R.id.imageView5)
            memberName = itemView.findViewById(R.id.textView10)
            p = parent
        }

        fun bind(data: FamilyMemberBindingModel){
            memberName.text = data.name
            userImage.setImageResource(imageList[data.image%imageList.size])
            userImage.setOnClickListener{
                var changeLayer = true
                if(data.needPassword){
                    val builder: AlertDialog.Builder? = AlertDialog.Builder(p.context)

                 }

                if(changeLayer){
                    //TODO: Add to local storage

                    //Switch To next activity
                    val i = Intent(p.context, HomeActivity::class.java)
                    p.context.startActivity(i)
                }else{
                    Toast.makeText(p.context,"PIN SALAH, Ulangi lagi kawan", Toast.LENGTH_LONG).show()
                }
            }
        }
}