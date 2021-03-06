package com.example.doitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.doitapp.databinding.ActivityMainBinding
import com.example.doitapp.welcomepage.WelcomePageActivity
import java.util.*

import kotlin.concurrent.schedule

class StarterActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        actionBarRemove()


        Timer("loadingUp Application", false).schedule(400){
            val intent = Intent(applicationContext, WelcomePageActivity::class.java)
            startActivity(intent)
            finish()
        }


    }

    fun actionBarRemove(){
        val getActionBar = supportActionBar
        getActionBar?.hide()
    }
}