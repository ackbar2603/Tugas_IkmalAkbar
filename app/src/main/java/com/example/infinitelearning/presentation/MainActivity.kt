package com.example.infinitelearning.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.infinitelearning.ui.theme.InfiniteLearningTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InfiniteLearningTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    MyApp()
                }

            }
        }
    }
}





//                val navController = rememberNavController()
//
//                NavHost(navController = navController,
//                    startDestination = "login"
//                ){
////                    composable("login"){
////                        LoginScreen(navController = navController)
////                    }
//
////                    composable("main"){
////                        MainScreen(navController = navController)
////                    }
//                    composable("login"){
//                        LoginScreen(navController = navController)
//                    }
//
//                    composable("main"){
//                        MainScreen(navController = navController)
//                    }
//
//
//                    composable("account"){
//                        AccountDetail(navController = navController)
//                    }
//                }