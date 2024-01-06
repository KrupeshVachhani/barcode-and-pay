package com.example.payment_app.screens

import NormalTextComponent
import HeadingTextComponent
import PasswordField
import MailField
import ButtonComponent
import DividerTextComponent
import ClickableTextComponentLogin
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.payment_app.R

@Composable
fun loginPage() {

    val focusManager = LocalFocusManager.current

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .clickable {
                focusManager.clearFocus()
            }
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            // Other components
            NormalTextComponent(value = stringResource(id = R.string.login))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))
            MailField(labelValue = stringResource(id = R.string.email))
            PasswordField(
                labelValue = stringResource(id = R.string.password),
                modifier = Modifier.padding(top = 0.dp)
            )

            // Ensure ButtonComponent is at the bottom with padding
            Spacer(modifier = Modifier.weight(1f))
            ButtonComponent(
                value = stringResource(id = R.string.login),
            )
            Spacer(modifier = Modifier.padding(bottom = 10.dp)  )

            DividerTextComponent()
            Spacer(modifier = Modifier.padding(bottom = 30.dp)  )

            ClickableTextComponentLogin(tryingToLogin = true, onSelectedText = {})
        }
    }
}


@Preview
@Composable
fun prevloginPage(showBackground: Boolean = true, showSystemUi: Boolean = true){
//    val navController = rememberNavController()  // Create a NavController for preview
    loginPage()
}
