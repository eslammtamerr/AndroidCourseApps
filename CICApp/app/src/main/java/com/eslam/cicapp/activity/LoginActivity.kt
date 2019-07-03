package com.eslam.cicapp.activity

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eslam.cicapp.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    lateinit  var  dialog : Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtn.setOnClickListener {

            val intent = Intent(this@LoginActivity , MainActivity::class.java)
            startActivity(intent)
        }

        registerLinerBtn.setOnClickListener {

            val itent = Intent(this@LoginActivity , RegisterActivity::class.java)
            startActivity(itent)
        }

        forgetPasswordBtn.setOnClickListener {

            val intent = Intent(this@LoginActivity, ForgetActivity::class.java)
            startActivity(intent)
        }

    }
}
