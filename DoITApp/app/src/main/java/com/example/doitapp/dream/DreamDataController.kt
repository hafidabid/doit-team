package com.example.doitapp.dream

import com.example.doitapp.dream.view.DreamData

interface DreamDataController {
    fun getDreams() : ArrayList<DreamData>
    fun addDream(dream: DreamData)
    fun backHome()
}