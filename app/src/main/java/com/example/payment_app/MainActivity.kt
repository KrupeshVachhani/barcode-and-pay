package com.example.payment_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.payment_app.screens.AppNavGraph
import com.example.payment_app.screens.SignupPage
import com.example.payment_app.screens.loginPage
import com.example.payment_app.ui.theme.Payment_AppTheme

class MainActivity : ComponentActivity() {

    lateinit var navController : NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Payment_AppTheme {
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
//                        AppNavGraph(navController = navController) // Pass NavController to AppNavGraph
//                        SignupPage()
                        loginPage()
                    }
            }
        }
        }

}
