package com.example.doitapp.dream

import android.content.Context
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Toast
import com.example.doitapp.R
import com.example.doitapp.dream.view.DreamData
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.Error

class DreamActivity : AppCompatActivity(), DreamDataController {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dream)
        dreamActionBar()


    }

    fun dreamActionBar(){
        val getActionBar = supportActionBar
        getActionBar?.setDisplayHomeAsUpEnabled(true)
        getActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#99CAFF")))
        getActionBar?.title = Html.fromHtml("<font color=\"black\" >Dream</font>")
    }

    override fun getDreams(): ArrayList<DreamData> {

        val sp = getSharedPreferences("DREAM", Context.MODE_PRIVATE)
        val gson = Gson()
        try {
            val jsondata = sp.getString("dreams","")
            if(jsondata.equals("")){
                return ArrayList<DreamData>()
            }
            val type = object : TypeToken<java.util.ArrayList<DreamData>>() {}.getType()
            val objs: ArrayList<DreamData> = gson.fromJson(jsondata, type)
            return objs
        }catch (e: Error){
            println(e)
            return ArrayList<DreamData>()
        }
    }

    override fun addDream(dream: DreamData) {
        val sp = getSharedPreferences("DREAM", Context.MODE_PRIVATE)
        val gson = Gson()
        val currDream = getDreams()
        val editor: SharedPreferences.Editor = sp.edit()
        currDream.add(dream)
        try {
            editor.putString("dreams", gson.toJson(currDream))
            editor.commit()
        }catch (e: Error){
            Toast.makeText(this, "Terjadi kelsalahan waktu add mimpi kamu", Toast.LENGTH_SHORT).show()
        }
    }

    override fun backHome() {
        finish()
    }
}