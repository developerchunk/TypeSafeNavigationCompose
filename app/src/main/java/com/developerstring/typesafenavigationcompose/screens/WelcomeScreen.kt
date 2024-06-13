package com.developerstring.typesafenavigationcompose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.developerstring.typesafenavigationcompose.navigation.WelcomeScreen
import com.developerstring.typesafenavigationcompose.ui.theme.Pink40

@Composable
fun WelcomeScreen(
    navController: NavController,
    arguments: WelcomeScreen
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
    ) {

        arguments.name?.let { name ->
            Text(text = name, fontSize = 28.sp, fontWeight = FontWeight.Medium)
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = arguments.message)

        Button(
            modifier = Modifier
                .padding(top = 90.dp),
            colors = ButtonDefaults.buttonColors(Pink40),
            onClick = {
                navController.popBackStack()
            }
        ) {
            Icon(imageVector = Icons.Rounded.ArrowBack, contentDescription = "back button", tint = Color.White)
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Back")
        }

    }

}