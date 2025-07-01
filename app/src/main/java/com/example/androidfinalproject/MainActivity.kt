package com.example.androidfinalproject

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidfinalproject.ui.theme.AndroidFinalProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidFinalProjectTheme {
                val context = LocalContext.current
                val navController = rememberNavController()
                val sharedPreferences =
                    context.getSharedPreferences("UserData", Context.MODE_PRIVATE)
                val isLoggedIn = sharedPreferences.getString("firstName", null) != null

                val startDestination = if (isLoggedIn) Home.route else Onboarding.route

                NavHost(navController = navController, startDestination = startDestination) {
                    composable(Onboarding.route){
                        Onboarding(navController)
                    }
                    composable(Home.route){
                        Home(navController)
                    }
                    composable(Profile.route) {
                        Profile(navController)
                    }
                }
            }
        }
    }
}
