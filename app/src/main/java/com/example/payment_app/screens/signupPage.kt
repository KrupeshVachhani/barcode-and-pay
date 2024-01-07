package com.example.payment_app.screens

import NormalTextComponent
import HeadingTextComponent
import MailField
import PasswordField
import NameField
import CheckBoxComponents
import ButtonComponent
import DividerTextComponent
import ClickableTextComponentLogin
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.payment_app.R
import com.nativemobilebits.loginflow.navigation.PostOfficeAppRouter
import com.nativemobilebits.loginflow.navigation.Screen
import androidx.compose.material3.Text as Text1
import androidx.compose.ui.platform.LocalFocusManager as LocalFocusManager1


@Composable
fun SignupPage() {
    val focusManager = LocalFocusManager1.current

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .clickable { focusManager.clearFocus() }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            NormalTextComponent(
                value = stringResource(id = R.string.hello)
            )
            HeadingTextComponent(value = stringResource(id = R.string.create_account))

            Column(
                modifier = Modifier.padding(top = 32.dp)
            ) {
                NameField(labelValue = stringResource(id = R.string.name))
                MailField(labelValue = stringResource(id = R.string.email))
                PasswordField(
                    labelValue = stringResource(id = R.string.password),
                    modifier = Modifier.padding(top = 0.dp)
                )
                CheckBoxComponents(value = stringResource(id = R.string.terms_condition))

                ButtonComponent(value = stringResource(id = R.string.register))

                DividerTextComponent()

                ClickableTextComponentLogin(tryingToLogin = true, onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.LoginScreen)
                } ) // Pass NavController

            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewSignupPage() {
    SignupPage()
//    val navController = rememberNavController()  // Create a NavController for preview
}
