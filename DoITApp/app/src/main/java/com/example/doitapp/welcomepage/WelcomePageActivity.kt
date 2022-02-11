package com.example.doitapp.welcomepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.doitapp.R
import com.example.doitapp.databinding.ActivityWelcomePageBinding

class WelcomePageActivity : AppCompatActivity() {
    lateinit var binding: ActivityWelcomePageBinding
    lateinit var welcomeScreenFragment: WelcomeScreenFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)

        welcomeScreenFragment = WelcomeScreenFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.welcomeFragment, welcomeScreenFragment)
            commit()
        }
    }
}