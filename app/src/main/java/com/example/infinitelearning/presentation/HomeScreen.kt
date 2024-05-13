package com.example.infinitelearning.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.infinitelearning.data.MainData
import com.example.infinitelearning.model.Keluarga
import com.example.infinitelearning.navigation.Screen
import com.example.infinitelearning.presentation.component.KeluargaItem

@Composable

fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    keluarga: List<Keluarga> = MainData.keluargaIkmal,
){
    LazyColumn (
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ){
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            ) {
                items(keluarga, key = { it.id } ){
                    KeluargaItem(keluarga = it ) { keluargaid ->
                        navController.navigate(Screen.DetailKeluarga.route + "/$keluargaid")

                    }
                }
            }
        }
    }
}



