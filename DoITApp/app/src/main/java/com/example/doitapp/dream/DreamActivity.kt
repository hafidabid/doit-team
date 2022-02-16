package com.example.doitapp.dream

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.example.doitapp.R

class DreamActivity : AppCompatActivity() {
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
}