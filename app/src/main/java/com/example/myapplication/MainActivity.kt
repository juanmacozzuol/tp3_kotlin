package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WelcomeScreen()
                }
            }
        }
    }
}

@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen centrada, sin deformarse
        Image(
            painter = painterResource(id = R.drawable.welcome_image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(0.7f) // 70% del ancho
                .aspectRatio(1f),   // mantiene proporción
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(24.dp))

        // 👇🏻 Texto exactamente como lo tenías
        Text(
            text = "Discover Your Dream Job Here",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color(0xFF1F41BB)
        )

        Text(
            text = "Explore all the existing job roles based on your interest and study major",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFF000000)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // 👇🏻 Botones lado a lado
        Row(
            modifier = Modifier.align(Alignment.CenterHorizontally), // centra el Row en la columna
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                onClick = { /* TODO */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1F41BB)),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .width(120.dp)
                    .height(40.dp)
            ) {
                Text("Login")
            }

            OutlinedButton(
                onClick = { /* TODO */ },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .width(120.dp)
                    .height(40.dp)
            ) {
                Text("Register")
            }
        }
    }
}
