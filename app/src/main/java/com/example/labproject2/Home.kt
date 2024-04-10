import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
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
import androidx.navigation.NavController
import com.example.labproject2.R
import com.example.labproject2.ui.theme.pictures

@Composable
fun HomePage(navController: NavController) {
    var showPopup by remember { mutableStateOf(false) }

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
            .background(brush = gradient)
    ) {
        Image(
            painter = painterResource(id = R.drawable.safari),
            contentDescription = "home logo",
            modifier = Modifier.padding(8.dp)
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "WELCOME",
            style = TextStyle(fontFamily = FontFamily.Cursive),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        LazyColumn(
            modifier = Modifier.fillMaxSize(1f),
            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(pictures) { picture ->
                Column {
                    Image(
                        painter = painterResource(id = picture.drawableId),
                        contentDescription = picture.description,
                        modifier = Modifier
                            .height(100.dp)
                            .fillMaxWidth()
                    )
                    Button(
                        onClick = { showPopup = true },
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Text("Book Now")
                    }
                }
            }
        }
    }

    if (showPopup) {
        AlertDialog(
            onDismissRequest = { showPopup = false },
            title = { Text("Confirmation") },
            text = { Text("Your activity is booked.") },
            confirmButton = {
                Button(
                    onClick = { showPopup = false }
                ) {
                    Text("OK")
                }
            }
        )
    }
}
