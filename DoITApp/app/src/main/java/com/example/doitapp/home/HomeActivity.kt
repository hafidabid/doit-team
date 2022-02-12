package com.example.doitapp.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.doitapp.R
import com.example.doitapp.databinding.ActivityHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    lateinit var activityHomeBinding: ActivityHomeBinding
    lateinit var berandaFragment: BerandaFragment
    lateinit var catatanFragment: CatatanFragment
    lateinit var peringkatFragment: PeringkatFragment
    lateinit var profilFragment: ProfilFragment
    var initFragment : Fragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        actionBarRemove()
        activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)

        berandaFragment = BerandaFragment()
        catatanFragment = CatatanFragment()
        peringkatFragment = PeringkatFragment()
        profilFragment = ProfilFragment()

        bottomNavHandler()
        initFragment = berandaFragment
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.homeFrame, berandaFragment)
            commit()
        }
    }

    fun actionBarRemove(){
        val getActionBar = supportActionBar
        getActionBar?.hide()
    }

    fun bottomNavHandler(){
        val btnBottom = findViewById<BottomNavigationView>(R.id.btmNavigation)
        btnBottom.setOnNavigationItemSelectedListener {it->
            when (it.itemId) {
                R.id.bottomBtnBeranda -> {
                    supportFragmentManager.beginTransaction().apply {
                        initFragment?.let { it1 -> remove(it1) }
                        replace(R.id.homeFrame, berandaFragment)
                        commit()
                    }
                    initFragment = berandaFragment
                }
                R.id.bottomBtnCatat -> {
                    supportFragmentManager.beginTransaction().apply {
                        initFragment?.let { it1 -> remove(it1) }
                        replace(R.id.homeFrame, catatanFragment)
                        commit()
                    }
                    initFragment = catatanFragment
                }
                R.id.bottomBtnPeringkat -> {
                    supportFragmentManager.beginTransaction().apply {
                        initFragment?.let { it1 -> remove(it1) }
                        replace(R.id.homeFrame, peringkatFragment)
                        commit()
                    }
                    initFragment = peringkatFragment
                }
                R.id.bottomBtnProfil -> {
                    supportFragmentManager.beginTransaction().apply {
                        initFragment?.let { it1 -> remove(it1) }
                        replace(R.id.homeFrame, profilFragment)
                        commit()
                    }
                    initFragment = profilFragment
                }
            }
            true
        }
    }
}