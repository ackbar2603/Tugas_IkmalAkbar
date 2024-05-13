package com.example.infinitelearning.presentation.component

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.infinitelearning.R
import com.example.infinitelearning.model.Favorites
import com.example.infinitelearning.ui.theme.InfiniteLearningTheme

@Composable
fun FavoriteItem(
    favorite: Favorites,
    modifier: Modifier = Modifier,
){
    Column(
        modifier = modifier.fillMaxWidth(),
    ){
        Image(
            painter = painterResource(id = favorite.photo),
            contentDescription = favorite.name,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = favorite.name,
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = favorite.favorites,
            textAlign = TextAlign.Center,
            color = when (favorite.favorites){
                "Favorites" -> Color.Green
                "Not Favor" -> Color.Red
                else -> MaterialTheme.colorScheme.primary
            },
            modifier = Modifier.fillMaxWidth()

        )
    }
}

@Preview
@Composable
private fun CourseItemPreview() {
    InfiniteLearningTheme {
        FavoriteItem(
            favorite = Favorites(
                1,
                "Favorite",
                "Kesukaan",
                R.drawable.p01
            ),
        )
    }
}