package com.example.infinitelearning.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.infinitelearning.data.MainData
import com.example.infinitelearning.model.Favorites
import com.example.infinitelearning.presentation.component.FavoriteItem
import com.example.infinitelearning.ui.theme.InfiniteLearningTheme

@Composable
fun FavScreen(
    modifier: Modifier = Modifier,
    favorites: List<Favorites> = MainData.mobileFavorites

){
    LazyVerticalGrid(
        contentPadding = PaddingValues(14.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        columns = GridCells.Adaptive(140.dp),
        modifier = modifier.fillMaxSize())
    {
        items(favorites, key = { it.id }){
            FavoriteItem(favorite = it)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview() {
    InfiniteLearningTheme {
        FavScreen(favorites = MainData.mobileFavorites)
    }
}