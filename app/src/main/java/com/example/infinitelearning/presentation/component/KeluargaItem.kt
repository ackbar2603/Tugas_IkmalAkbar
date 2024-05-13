package com.example.infinitelearning.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.infinitelearning.R
import com.example.infinitelearning.model.Keluarga
import com.example.infinitelearning.ui.theme.InfiniteLearningTheme

@Composable
fun KeluargaItem(
    keluarga: Keluarga,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(keluarga.id)
        }
    ){
        Image(
            painter = painterResource(id = keluarga.photos),
            contentDescription = keluarga.name, modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Text(
            text = keluarga.name,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )
        Text(
            text = keluarga.status,
            color = MaterialTheme.colorScheme.primary,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun KeluargaItemHorizontalPreview() {
    InfiniteLearningTheme {
        KeluargaItem(
            keluarga = Keluarga(1, "Ikmal Akbar", "Kemal Ackbar", "Anak Pertama", R.drawable.ikmal_akbar),
            onItemClicked = { keluargaid ->
                println("Keluarga Id : $keluargaid")
            }
        )
    }
}