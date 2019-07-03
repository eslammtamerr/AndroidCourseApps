package com.eslam.cicapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.eslam.cicapp.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    var FirstName : String =""
    var Password : String = ""
    var ConfirmaPassword : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        getDataFromDesign()
    }




    private  fun getDataFromDesign (){

        registerBtn.setOnClickListener {

            Toast.makeText(this@RegisterActivity," your first name : "+FirstName , Toast.LENGTH_LONG).show()
            FirstName =  EdFname.text.toString()

            Password = EdPassword.text.toString()

            ConfirmaPassword=EdConfirmationPassword.text.toString()


            if (Password==ConfirmaPassword){

                Toast.makeText(this@RegisterActivity,"done " , Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this@RegisterActivity,"error " , Toast.LENGTH_LONG).show()
                EdConfirmationPassword.error=" Not Matched "
            }

        }


            }





//            Log.e("firstName", FirstName)

}
