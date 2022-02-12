package com.example.doitapp.welcomepage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.doitapp.R
import com.example.doitapp.databinding.ActivityWelcomePageBinding
import com.example.doitapp.familyselect.FamilySelectActivity

class WelcomePageActivity : AppCompatActivity(), WelcomeFragmentInterface {
    lateinit var binding: ActivityWelcomePageBinding
    lateinit var welcomeScreenFragment: WelcomeScreenFragment
    private lateinit var registerFragment: RegisterFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)
        actionBarRemove()
        welcomeScreenFragment = WelcomeScreenFragment()
        registerFragment= RegisterFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.welcomeFragment, welcomeScreenFragment)
            commit()
        }
    }

    override fun checkLogin(username: String, password: String) {
        val dummyUsn = "test"
        val dummyPass = "asdf1234"

        if(username.equals(dummyUsn) && password.equals(dummyPass)){
            val i = Intent(applicationContext, FamilySelectActivity::class.java)
            startActivity(i)
            this.finish()
        }else{
            Toast
                .makeText(this, "Username atau password salah", Toast.LENGTH_LONG)
                .show()
        }
    }

    override fun registerPage() {
        supportFragmentManager.beginTransaction().apply {
            remove(welcomeScreenFragment)
            replace(R.id.welcomeFragment, registerFragment)
            commit()
        }
    }

    override fun loginPage() {
        supportFragmentManager.beginTransaction().apply {
            remove(registerFragment)
            replace(R.id.welcomeFragment, welcomeScreenFragment)
            commit()
        }
    }

    override fun registerUser(username: String, password: String, phone: String) {
        TODO("Not yet implemented")
    }

    fun actionBarRemove(){
        val getActionBar = supportActionBar
        getActionBar?.hide()
    }
}