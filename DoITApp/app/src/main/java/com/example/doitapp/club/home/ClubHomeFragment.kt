package com.example.doitapp.club.home

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doitapp.R
import com.example.doitapp.databinding.FragmentClubHomeBinding
import com.example.doitapp.databinding.FragmentWelcomeScreenBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ClubHomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ClubHomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var vBind : FragmentClubHomeBinding
    lateinit var v : View
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
        v = inflater.inflate(R.layout.fragment_club_home, container, false)

        val popularView = v.findViewById<RecyclerView>(R.id.clubHomePopularRecyView)
        popularView.layoutManager = LinearLayoutManager(v.context)
        popularView.adapter = PopularAdapter(this.getPopularData())

        val subscribeButton = v.findViewById<Button>(R.id.button3)
        subscribeButton.setOnClickListener {
            Navigation.findNavController(v).navigate(R.id.action_clubHomeFragment_to_clubMembershipFragment)
        }
        (activity as AppCompatActivity).supportActionBar?.title ="Club"
        setHasOptionsMenu(true)

        return v
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater!!.inflate(R.menu.club_topbar, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item!!.itemId
        if(id==R.id.tombolMenujuStatistik){
            Navigation.findNavController(v).navigate(R.id.action_clubHomeFragment_to_clubStatisticsFragment)
        }

        return super.onOptionsItemSelected(item)
    }

    fun getPopularData() : ArrayList<PopularModel>{
        val al = ArrayList<PopularModel>()
        al.add(PopularModel("Ternak Lele","","revi"))
        al.add(PopularModel("Cara makan kerupuk","","sunahung"))
        al.add(PopularModel("Cara Buka Google","","hanung"))
        al.add(PopularModel("Cara mendapat ip4","","ya belajar"))
        return al
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ClubHomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ClubHomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}