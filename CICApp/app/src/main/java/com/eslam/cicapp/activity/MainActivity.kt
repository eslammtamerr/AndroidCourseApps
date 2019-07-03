package com.eslam.cicapp.activity

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.eslam.cicapp.R
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.eslam.cicapp.activity.adapter.NamesAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        declearRecycleView()


    }

    @SuppressLint("WrongConstant")
    private fun declearRecycleView() {
        rvNames.layoutManager=LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
        rvNames.setHasFixedSize(true)
        rvNames.adapter= NamesAdapter(this@MainActivity, mutableListOf("islam","aziz","bade3","hana"))
    }
}
