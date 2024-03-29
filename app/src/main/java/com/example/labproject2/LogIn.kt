package com.example.labproject2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LogIn(){
    Column (
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier= Modifier
            .fillMaxSize()
            .background(color = Color.White)

    ) {
        Image(painter = painterResource(id = R.drawable.safari), contentDescription = "logIn Logo")

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "LOG IN", style = TextStyle(fontFamily = FontFamily.Cursive),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = " Name")
        })
        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Enter Password")
        })

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = { }) {
            Text(text = "Log In")


        }

        Spacer(modifier = Modifier.height(10.dp))

        TextButton(onClick = { }) {
            Text(text = "Forgot Password")


        }
    }

}