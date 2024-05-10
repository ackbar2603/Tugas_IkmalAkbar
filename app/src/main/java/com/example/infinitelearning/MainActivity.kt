package com.example.infinitelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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

                val navController = rememberNavController()

                NavHost(navController = navController,
                    startDestination = "login"
                ){
//                    composable("login"){
//                        LoginScreen(navController = navController)
//                    }

//                    composable("main"){
//                        MainScreen(navController = navController)
//                    }
                    composable("login"){
                        LoginScreen(navController = navController)
                    }
                    
                    composable("main"){
                        MainScreen(navController = navController)
                    }

                    composable("account"){
                        AccountDetail(navController = navController)
                    }
                }

            }
        }
    }
}

