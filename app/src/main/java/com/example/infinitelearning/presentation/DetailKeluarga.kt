package com.example.infinitelearning.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.android.volley.toolbox.ImageRequest
import com.example.infinitelearning.data.MainData
import com.example.infinitelearning.model.Keluarga
import com.example.infinitelearning.navigation.Screen

@Composable
fun KeluargaDetail (
    modifier: Modifier = Modifier,
    navController: NavController,
    keluargaid: Int?
){
    val newFamList = MainData.keluargaIkmal.filter { keluarga ->
        keluarga.id == keluargaid
    }
    Column (
        modifier = modifier
    ){
        DetailKeluargaContent(newFamList = newFamList)
    }
}

@Composable
private fun DetailKeluargaContent (
    newFamList: List<Keluarga>,
    modifier: Modifier = Modifier
){
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(16.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builders(LocalContext.current)
                .data(data = newFamList[0].photos)
                .build(),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(height = 250.dp, width = 170.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentDescription = "Poster Movie"
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = newFamList[0].name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "(${newFamList[0].panggilan})",
                style = MaterialTheme.typography.titleSmall,
            )
            Text(
                text = "Role : ${newFamList[0].status}",
                style = MaterialTheme.typography.titleSmall,
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun DetailKeluargaPrewiew() {
    DetailKeluargaContent(newFamList = MainData.keluargaIkmal)
}