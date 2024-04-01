package com.example.labproject2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
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
fun StartPage() {
    // Define the gradient
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
            .background(brush = gradient) // Apply the gradient as the background
    ) {
        Image(painter = painterResource(id = R.drawable.safari), contentDescription = "HomePage")

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "An indoor Family Fun Center with a restaurant guaranteed to change your mind about food at indoor play areas. " +
                    "Our Family Fun Center serves nothing but the best and highest quality from our pizza to our burgers (Angus Beef) to our wings to our famous cheese bread and to the freshest salad bar around. " +
                    "Don’t forget about our Dippin’ Dots for an after meal dessert or a summer dessert with the family",
            style = TextStyle(fontFamily = FontFamily.Cursive),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(40.dp))

        Button(onClick = { }) {
            Text(text = "Sign Up")
        }
        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = { }) {
            Text(text = "Log In")
        }
    }
}
