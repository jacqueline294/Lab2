package com.example.labproject2


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import androidx.navigation.NavHostController

@Composable
fun HomePage(navController: NavHostController) {
    val gradient = Brush.horizontalGradient(
        colors = listOf(Color.Yellow, Color.Cyan),
        startX = 0f,
        endX = 1000f
    )
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)

    ) {
        Image(painter = painterResource(id = R.drawable.safari), contentDescription = "logIn Logo")

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "WELCOME", style = TextStyle(fontFamily = FontFamily.Cursive),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
