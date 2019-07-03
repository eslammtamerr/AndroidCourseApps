package com.eslam.cicapp.activity.model



data class LoginModel(

    val status : Int ,
    val data : MyData


)


data class MyData(

    val userID : Int ,
    val name : String ,
    val age : String ,
    val image : String



)