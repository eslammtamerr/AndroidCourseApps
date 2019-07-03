package com.eslam.cicapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eslam.cicapp.R
import kotlinx.android.synthetic.main.activity_.*

class ForgetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_)


        newPassBtn.setOnClickListener {
            val itent = Intent(this@ForgetActivity, NewPasswordActivity::class.java)
            itent.putExtra("userId","21")
            startActivity(itent)
        }
    }
}
