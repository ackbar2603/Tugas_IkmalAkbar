package com.example.infinitelearning

import android.annotation.SuppressLint
import android.provider.ContactsContract.Profile
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.infinitelearning.data.DataProvider
import com.example.infinitelearning.data.Stuff

@Composable
fun StuffHome(navigateToProfile: (Stuff) -> Unit){
    val stuffs = remember {DataProvider.stuffList}
    LazyColumn (
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        items(
            items= stuffs,
            itemContent = {
                StuffListItem(stuff = it)
            }
        )
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun MyApp(navigateToProfile: (Stuff) -> Unit) {
    Scaffold(
        content = {
            StuffHome(navigateToProfile = navigateToProfile)
        }
    )
}