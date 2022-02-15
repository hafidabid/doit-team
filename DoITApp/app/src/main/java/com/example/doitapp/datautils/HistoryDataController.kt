package com.example.doitapp.datautils

import com.example.doitapp.home.adpters.HistoryModel

class HistoryDataController {

    companion object {
        fun getHistory() : ArrayList<HistoryModel>{
            val r = ArrayList<HistoryModel>()

            r.add(HistoryModel("makanan", "bakso", "40.000",2))
            r.add(HistoryModel("minuman", "captain morgan", "540.000",1))
            r.add(HistoryModel("kesehatan", "obat mata", "40.000",3))
            r.add(HistoryModel("hiburan", "Healing", "4.000.000",4))
            r.add(HistoryModel("makanan", "bakso", "40.000",2))
            r.add(HistoryModel("minuman", "captain morgan", "540.000",1))
            r.add(HistoryModel("kesehatan", "obat mata", "40.000",3))
            r.add(HistoryModel("hiburan", "Healing", "4.000.000",4))
            r.add(HistoryModel("makanan", "bakso", "40.000",2))
            r.add(HistoryModel("minuman", "captain morgan", "540.000",1))
            r.add(HistoryModel("kesehatan", "obat mata", "40.000",3))
            r.add(HistoryModel("hiburan", "Healing", "4.000.000",4))

            return r
        }
    }
}