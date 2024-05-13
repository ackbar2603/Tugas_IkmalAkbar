package com.example.infinitelearning.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.infinitelearning.R
import com.example.infinitelearning.navigation.NavigationItem
import com.example.infinitelearning.navigation.Screen
import androidx.compose.material3.NavigationBarItem as NavigationBarItem1

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun MyApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
){
    val context = LocalContext.current

    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text(text = "Ikmal App") },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)
                    }
                })
        },
        bottomBar = {
            BottomBar(navController)
        },
        modifier = modifier
    ){ contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ){
            composable(Screen.Home.route){
                HomeScreen(navController)
            }
            composable(Screen.Account.route){
                AccountDetail(navController)
            }
            composable(Screen.Photos.route){
                PhotoScreen()
            }

        }
    }
}

@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavigationBar (
        modifier = modifier
    ){
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id =  R.string.home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id =  R.string.photos),
                icon = Icons.Default.AccountBox,
                screen = Screen.Photos
            ),
            NavigationItem(
                title = stringResource(id =  R.string.favorite),
                icon = Icons.Default.Favorite,
                screen = Screen.Favorite
            ),

        )
        navigationItems.map { item ->
            NavigationBarItem1(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun InfiniteAppPrev() {
    MyApp()
}