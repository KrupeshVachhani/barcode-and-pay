package com.example.payment_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.payment_app.ui.theme.Payment_AppTheme
import com.nativemobilebits.loginflow.app.PostOfficeApp

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
//                        loginPage()
                        PostOfficeApp()

                    }
            }
        }
        }

}
