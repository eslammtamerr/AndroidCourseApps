package com.eslam.cicapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.eslam.cicapp.R

class NewPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_password)
        getDataFromIntent()
    }

    private fun getDataFromIntent() {

        val getData = intent
        val userID = getData.getStringExtra("userId")
        Log.e("UserId",userID)

    }
}
