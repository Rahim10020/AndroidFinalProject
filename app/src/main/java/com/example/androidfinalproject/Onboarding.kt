package com.example.androidfinalproject

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun OnboardingPreview() {
    Onboarding()
}

@Composable
fun Onboarding() {
    var firstName by rememberSaveable { mutableStateOf(TextFieldValue("")) }
    var lastName by rememberSaveable { mutableStateOf(TextFieldValue("")) }
    var email by rememberSaveable { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier.padding(top = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top

    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo image",
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(24.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(color = Color(0xFF495E57))
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Let's Know about you",
                fontSize = 24.sp,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = "Personal Information",
            fontSize = 19.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Start).padding(start = 16.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = firstName,
            onValueChange = { firstName = it },
            label = { Text(text = "First Name") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
        OutlinedTextField(
            value = lastName,
            onValueChange = { lastName = it },
            label = { Text(text = "Last Name") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
        Spacer(modifier = Modifier.height(48.dp))
        Button(
            onClick = {},
            border = BorderStroke(1.dp, color = Color(0xFF9E661B)),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4CE14)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .height(48.dp)
        ) {
            Text(
                text = "Register",
                fontSize = 16.sp,
                color = Color.Black,
            )
        }
    }
}