package com.example.doitapp.club

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import com.example.doitapp.R
import com.example.doitapp.club.category.ClubCategoryFragment
import com.example.doitapp.club.content.ClubContetntFragment
import com.example.doitapp.club.home.ClubHomeFragment
import com.example.doitapp.club.membership.ClubMembershipFragment
import com.example.doitapp.club.statistics.ClubStatisticsFragment

class ClubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_club)

        val clubContetntFragment = ClubContetntFragment()
        val clubStatisticsFragment = ClubStatisticsFragment()
        val clubMembershipFragment = ClubMembershipFragment()
        clubActionBar()

//        supportFragmentManager.beginTransaction().apply{
//            replace(R.id.clubFrameLayout, ClubHomeFragment())
//            commit()
//        }
    }

    fun clubActionBar(){
        val getActionBar = supportActionBar
        getActionBar?.setDisplayHomeAsUpEnabled(true)
        getActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#FF7482")))
        getActionBar?.title = Html.fromHtml("<font color=\"black\" >Club</font>")

    }
}