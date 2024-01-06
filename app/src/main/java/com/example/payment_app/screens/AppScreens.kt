package com.example.payment_app.screens

sealed class AppScreens (val route:String){

    object sigupScreen : AppScreens("signup_screen")
    object loginScreen : AppScreens("login_screen")
}