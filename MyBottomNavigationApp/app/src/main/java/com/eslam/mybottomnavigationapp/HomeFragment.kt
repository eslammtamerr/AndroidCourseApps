package com.eslam.mybottomnavigationapp


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eslam.cicapp.activity.adapter.NamesAdapter
import kotlinx.android.synthetic.main.fragment_home.*
import java.lang.reflect.GenericDeclaration


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    @SuppressLint("WrongConstant")
    private fun declearRecycleView() {
        rvNames.layoutManager= LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL,false)
        rvNames.setHasFixedSize(true)
        rvNames.adapter= NamesAdapter(this@HomeFragment, mutableListOf("islam","aziz","bade3","hana"))
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        declearRecycleView()

    }

}
