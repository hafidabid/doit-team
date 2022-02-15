package com.example.doitapp.quest.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doitapp.R
import com.example.doitapp.databinding.FragmentQuestBinding

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment() {

    private lateinit var pageViewModel: PageViewModel
    private var _binding: FragmentQuestBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProvider(this).get(PageViewModel::class.java).apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentQuestBinding.inflate(inflater, container, false)
        val root = binding.root

        val rv = root.findViewById<RecyclerView>(R.id.questCurrRecyView)
        rv.layoutManager = LinearLayoutManager(rv.context)
        rv.adapter = QuestListAdapter(getQuestList())

        //val textView: TextView = binding.sectionLabel

//        pageViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

    fun getQuestList() : ArrayList<QuestBucketModel> {
        val r = ArrayList<QuestBucketModel>()
        r.add(QuestBucketModel("Jalan jalan ke bali", 100))
        r.add(QuestBucketModel("mandi", 900))
        r.add(QuestBucketModel("Solat", 60))
        r.add(QuestBucketModel("tidur", 12))
        r.add(QuestBucketModel("makan", 23))
        r.add(QuestBucketModel("nabung", 90))
        r.add(QuestBucketModel("nonton tipi", 20))
        return r
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}