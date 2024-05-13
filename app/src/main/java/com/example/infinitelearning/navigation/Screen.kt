package com.example.infinitelearning.navigation

sealed class Screen (val route: String){
    data object Login: Screen("login")
    data object Home: Screen("home")
    data object Account: Screen("account")
    data object Favorite: Screen("favorite")
    data object Photos: Screen("photos")
    data object DetailKeluarga: Screen("detail_keluarga")
}