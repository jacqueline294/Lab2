package com.example.labproject2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun SignUp(){

    Column {
        modifier= Modifier
        .fillMaxSize()
        verticalArrangement= Arrangement.Center
        Image(painter = painterResource(id = R.drawable.safari), contentDescription = "Logo")
        Text(text = "Welcome Sign up Here")

    }


}