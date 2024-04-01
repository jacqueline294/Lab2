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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SignUp(){

    val gradient = Brush.horizontalGradient(
        colors = listOf(Color.Yellow, Color.Cyan),
        startX = 0f,
        endX = 1000f
    )


    Column (
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier= Modifier
            .fillMaxSize()
            .background(color = Color.White)

    ){
        Image(painter = painterResource(id = R.drawable.safari), contentDescription = "Logo",)

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Welcome Sign up Here", style = TextStyle(fontFamily = FontFamily.Cursive),
            fontSize = 32.sp,
            fontWeight= FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = " Name")
        })
        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Email Address")
        })
        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Create Password")
        })

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = { }) {
            Text(text = "Sign Up")


    }

    }


}