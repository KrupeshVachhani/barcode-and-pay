package com.example.payment_app.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavGraph(navController:NavHostController){
    NavHost(navController=navController,
        startDestination = AppScreens.sigupScreen.route){

        composable(route = AppScreens.sigupScreen.route) {
            SignupPage() // Pass the NavController to SignupPage
        }
        composable(route = AppScreens.loginScreen.route) {
            loginPage() // Pass the NavController to loginPage (if needed)
        }

    }


}