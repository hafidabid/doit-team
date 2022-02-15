package com.example.doitapp.quest

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toolbar
import com.example.doitapp.R
import com.example.doitapp.databinding.ActivityQuestBinding
import com.example.doitapp.quest.ui.main.SectionsPagerAdapter

class QuestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)

    }
}