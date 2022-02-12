package com.example.doitapp.familyselect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doitapp.R
import com.example.doitapp.databinding.ActivityFamilySelectBinding

class FamilySelectActivity : AppCompatActivity() {
    lateinit var view : ActivityFamilySelectBinding
    lateinit var familyData : ArrayList<FamilyMemberBindingModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family_select)
        actionBarRemove()
        view = ActivityFamilySelectBinding.inflate(layoutInflater)
        loadFamilyData()

        val recylcer = findViewById<RecyclerView>(R.id.familyRecyView)
        recylcer.layoutManager = GridLayoutManager(this, 2)
        recylcer.adapter = FSelectViewAdapter(familyData)
    }

    fun loadFamilyData(){
        familyData = ArrayList()
        familyData.add(FamilyMemberBindingModel("1", "robert", 1, false, 123456))
        familyData.add(FamilyMemberBindingModel("1", "tata", 2, false, 123456))
        familyData.add(FamilyMemberBindingModel("1", "jon", 3, false, 123456))
        familyData.add(FamilyMemberBindingModel("1", "ujang", 4, false, 123456))
        familyData.add(FamilyMemberBindingModel("1", "amer", 4, false, 123456))

    }

    fun actionBarRemove(){
        val getActionBar = supportActionBar
        getActionBar?.hide()
    }
}