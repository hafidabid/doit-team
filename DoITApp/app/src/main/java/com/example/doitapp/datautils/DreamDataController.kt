package com.example.doitapp.datautils

import com.example.doitapp.dream.view.DreamData

class DreamDataController {

    companion object{
        fun getDream() : ArrayList<DreamData>{
            val r = ArrayList<DreamData>()
            r.add(DreamData("target 1",500000,"12-12-2022","mboh lur"))
            r.add(DreamData("target 2",600000,"10-12-2022","mboh lur"))
            r.add(DreamData("target 3",700000,"12-11-2022","mboh lur"))
            r.add(DreamData("target 4",800000,"12-10-2022","mboh lur"))
            r.add(DreamData("target 5",900000,"12-12-2022","mboh lur"))
            r.add(DreamData("target 6",530000,"12-12-2022","mboh lur"))
            r.add(DreamData("target 7",506000,"12-12-2022","mboh lur"))
            r.add(DreamData("target 8",500600,"12-12-2022","mboh lur"))
            r.add(DreamData("target 9",500060,"12-12-2022","mboh lur"))
            r.add(DreamData("target 10",500400,"12-12-2022","mboh lur"))

            return r
        }

        fun addDream(){

        }
    }
}