package com.nativemobilebits.loginflow.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.payment_app.screens.SignupPage
import com.example.payment_app.screens.loginPage
import com.nativemobilebits.loginflow.navigation.PostOfficeAppRouter
import com.nativemobilebits.loginflow.navigation.Screen

@Composable
fun PostOfficeApp() {

//    homeViewModel.checkForActiveSession()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {

//        if (homeViewModel.isUserLoggedIn.value == true) {
//            PostOfficeAppRouter.navigateTo(Screen.HomeScreen)
//        }

        Crossfade(targetState = PostOfficeAppRouter.currentScreen) { currentState ->
            when (currentState.value) {
                is Screen.SignUpScreen -> {
                    SignupPage()
                }

//                is Screen.TermsAndConditionsScreen -> {
//                    TermsAndConditionsScreen()
//                }

                is Screen.LoginScreen -> {
                    loginPage()
                }

//                is Screen.HomeScreen -> {
//                    HomeScreen()
//                }
            }
        }

    }
}