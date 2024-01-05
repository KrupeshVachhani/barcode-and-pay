import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*

import androidx.compose.runtime.*

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.constraintlayout.compose.Visibility
import com.example.payment_app.R
import com.example.payment_app.ui.theme.ComponentShapes
import com.example.payment_app.ui.theme.Primary
import com.example.payment_app.ui.theme.Secondary
import com.example.payment_app.ui.theme.TextColor
import androidx.compose.material3.Icon as Icon1


@Composable
fun NormalTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 24.sp,
            color = Color.Black,
            fontWeight = FontWeight.Normal
        ),
        textAlign = TextAlign.Center
    )
}


@Composable
fun HeadingTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 32.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        ),
        textAlign = TextAlign.Center
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NameField(labelValue: String) {
    val textValue = remember { mutableStateOf("") }

    OutlinedTextField(
        label = { Text(text = labelValue) },

        value = textValue.value,
        keyboardOptions = KeyboardOptions.Default,
        onValueChange = { textValue.value = it },
        leadingIcon = {
            Icon1(
                imageVector = Icons.Filled.Person,
                contentDescription = null
            )
        },
        textStyle = TextStyle(color = TextColor, fontWeight = FontWeight.Normal),
        modifier = Modifier
            .fillMaxWidth()
            .clip(ComponentShapes.small)
            .padding(horizontal = 16.dp)
        ,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Primary,
            unfocusedBorderColor = Primary,
            focusedLabelColor = Primary,
            cursorColor = Primary,
        )
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MailField(labelValue: String) {
    val textValue = remember { mutableStateOf("") }

    OutlinedTextField(
        label = { Text(text = labelValue) },

        value = textValue.value,
        keyboardOptions = KeyboardOptions.Default,
        onValueChange = { textValue.value = it },
        leadingIcon = {
            Icon1(
            imageVector = Icons.Filled.Email,
            contentDescription = null
        )
        },
        textStyle = TextStyle(color = TextColor, fontWeight = FontWeight.Normal),
        modifier = Modifier
            .fillMaxWidth()
            .clip(ComponentShapes.small)
            .padding(horizontal = 16.dp)
        ,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Primary,
            unfocusedBorderColor = Primary,
            focusedLabelColor = Primary,
            cursorColor = Primary,
        )
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordField(labelValue: String, modifier: Modifier) {
    val textValue = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }

    OutlinedTextField(
        label = { Text(text = labelValue) },
        value = textValue.value,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        onValueChange = { textValue.value = it },
//        maxLines = 2,
        leadingIcon = {
            Image(
                painter = painterResource(id = R.drawable.password_icon_background),
                contentDescription = "",
                modifier = Modifier.size(24.dp)
            )
        },
        textStyle = TextStyle(color = TextColor, fontWeight = FontWeight.Normal),
        modifier = modifier
            .fillMaxWidth()
            .clip(ComponentShapes.small)
            .padding(horizontal = 16.dp, vertical = 0.dp)
            .then(Modifier.padding(top = 0.dp, bottom = 16.dp)),
        trailingIcon = {
            val icon = if (passwordVisible.value) {
                Icons.Filled.Visibility  // Show password
            } else {
                Icons.Filled.VisibilityOff  // Hide password
            }

            IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                Icon1(icon, contentDescription = "Toggle password visibility")
            }
        },
        visualTransformation = if (passwordVisible.value) {
            VisualTransformation.None  // Show plain text
        } else {
            PasswordVisualTransformation()  // Mask password
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Primary,
            unfocusedBorderColor = Primary,
            focusedLabelColor = Primary,
            cursorColor = Primary,
        )
    )
}


@Composable
fun CheckBoxComponents(value:String){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(42.dp)
            .padding(horizontal = 16.dp),
         verticalAlignment = Alignment.CenterVertically

    ) 
    {
        val checkedState = remember {
            mutableStateOf(false)
        }
        Checkbox(checked = checkedState.value , onCheckedChange ={
            checkedState.value != checkedState.value
        } )

        ClickableTextComponent(value=value)
    }
}


@Composable
fun ClickableTextComponent(value: String) {
    val initialText = "By continuing you accept our "
    val privacyPolicyText = " Privacy Policy "
    val andText = " and "
    val termsAndConditionsText = " Term of Use "

    val annotatedString = buildAnnotatedString {
        append(initialText)
        withStyle(style = SpanStyle(color = Primary)) {
            pushStringAnnotation(tag = privacyPolicyText, annotation = privacyPolicyText)
            append(privacyPolicyText)
        }
        append(andText)
        withStyle(style = SpanStyle(color = Primary)) {
            pushStringAnnotation(tag = termsAndConditionsText, annotation = termsAndConditionsText)
            append(termsAndConditionsText)
        }
    }
    ClickableText(text=annotatedString, onClick = {
        offset ->

        annotatedString.getStringAnnotations(offset,offset)
            .firstOrNull()?.also{

            }
    })
}

@Composable
fun ButtonComponent(value:String){
    Button(onClick={

    },
        modifier= Modifier
            .fillMaxWidth()
            .heightIn(48.dp)
            .padding(horizontal = 16.dp, vertical = 24.dp)
        ,

        contentPadding= PaddingValues(),
        colors=ButtonDefaults.buttonColors(Color.Transparent)
    ){
        Box(modifier = Modifier.run {
            fillMaxWidth()
                .heightIn(48.dp)
                .background(
                    brush =  Brush.horizontalGradient(listOf(Secondary, Primary)),
                    shape = RoundedCornerShape(50.dp)
                )
        },
                contentAlignment = Alignment.Center
        ){
            Text(text = value,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
                )
        }

    }
}