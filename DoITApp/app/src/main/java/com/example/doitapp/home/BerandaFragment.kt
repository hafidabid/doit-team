package com.example.doitapp.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doitapp.R
import com.example.doitapp.club.ClubActivity
import com.example.doitapp.databinding.FragmentBerandaBinding
import com.example.doitapp.databinding.FragmentWelcomeScreenBinding
import com.example.doitapp.datautils.HistoryDataController
import com.example.doitapp.home.adpters.HistoryAdapter
import com.example.doitapp.quest.QuestActivity

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BerandaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BerandaFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_beranda, container, false)

        val clubBtn = view.findViewById<ImageView>(R.id.imageView7)

        clubBtn?.setOnClickListener {
            val i = Intent(view.context, ClubActivity::class.java)
            startActivity(i)
        }

        val questBtn = view.findViewById<ImageView>(R.id.imageView9)
        questBtn?.setOnClickListener{
            val i = Intent(view.context, QuestActivity::class.java)
            startActivity(i)
        }

        val history = view.findViewById<RecyclerView>(R.id.historyRecyView)
        history.layoutManager = LinearLayoutManager(view.context)
        history.adapter = HistoryAdapter(HistoryDataController.getHistory())

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BerandaFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BerandaFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}