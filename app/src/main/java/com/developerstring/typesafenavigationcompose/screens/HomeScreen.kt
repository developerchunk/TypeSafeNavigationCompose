package com.developerstring.typesafenavigationcompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.developerstring.typesafenavigationcompose.navigation.WelcomeScreen
import com.developerstring.typesafenavigationcompose.ui.theme.Pink40
import com.developerstring.typesafenavigationcompose.ui.theme.Pink80
import com.developerstring.typesafenavigationcompose.ui.theme.Purple80
import com.developerstring.typesafenavigationcompose.ui.theme.PurpleGrey80

@Composable
fun HomeScreen(
    navController: NavController
) {

    var name by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .width(280.dp)
                .height(200.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Pink80.copy(alpha = 0.3f))
        ) {

            Column(
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .padding(horizontal = 30.dp)
            ) {

                Spacer(modifier = Modifier.height(20.dp))

                TextField(
                    modifier = Modifier
                        .fillMaxWidth(),
                    value = name,
                    onValueChange = {
                        name = it
                    },
                    shape = RoundedCornerShape(20.dp),
                    singleLine = true,
                    textStyle = TextStyle(
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center
                    ),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Pink80,
                        unfocusedContainerColor = Pink80,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    ),
                    placeholder = {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Enter your Name",
                            color = Color.Black.copy(alpha = 0.45f),
                            fontSize = 18.sp,
                            textAlign = TextAlign.Center
                        )
                    }
                )
            }

            Button(modifier = Modifier
                .padding(bottom = 30.dp)
                .align(alignment = Alignment.BottomCenter),
                colors = ButtonDefaults.buttonColors(Pink40),
                onClick = {
                    navController.navigate(
                        WelcomeScreen(
                            name = name,
                            message = "We are welcoming you to the new Type Safe Navigation with Jetpack Compose"
                        )
                    )
                }) {
                Text(text = "Next")
                Spacer(modifier = Modifier.width(10.dp))
                Icon(
                    imageVector = Icons.Rounded.ArrowForward,
                    contentDescription = "next button",
                    tint = Color.White
                )
            }

        }

    }


}
