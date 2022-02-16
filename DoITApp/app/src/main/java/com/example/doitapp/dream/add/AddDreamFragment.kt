package com.example.doitapp.dream.add

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.example.doitapp.R
import com.example.doitapp.datautils.DreamDataController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AddDreamFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddDreamFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var v: View
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
        v = inflater.inflate(R.layout.fragment_add_dream, container, false)

        (activity as AppCompatActivity).supportActionBar?.title = Html.fromHtml("<font color=\"black\" >Add Dream</font>")

        val btnSimpan = v.findViewById<Button>(R.id.button4)
        val formKeinginan = v.findViewById<EditText>(R.id.editTextTextPersonName)
        val formWaktu = v.findViewById<EditText>(R.id.editTextDate)
        val formNominal = v.findViewById<EditText>(R.id.editTextNumber)
        val formCatatan = v.findViewById<EditText>(R.id.editTextTextPersonName2)
        btnSimpan.setOnClickListener{
            if(
                (formKeinginan.text.length > 3) and (formNominal.text.length > 3) and (formWaktu.text.length > 8)
            ){
                DreamDataController.addDream()
                Navigation.findNavController(v).navigate(R.id.action_addDreamFragment_to_myDreamFragment)
            }else{
                Toast.makeText(v.context, "Form diatas belum lengkap", Toast.LENGTH_SHORT).show()
            }
        }

        return v
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AddDreamFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AddDreamFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}