package com.example.infinitelearning

import android.annotation.SuppressLint
import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController


@Composable
fun AccountDetail(navController: NavHostController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ){
        Text(text = "Personal Detail", fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Image(painter = painterResource(id = R.drawable.ikmal), contentDescription = "personal detail",
            Modifier.size(120.dp))
        Text(text = "Ikmal Akbar", fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(25.dp))

        Card (
            modifier = Modifier.size(width = 350.dp, height = 80.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White),
            elevation = CardDefaults.elevatedCardElevation(2.dp)
        ){
            Column (
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 12.dp, end = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = "Email: ", fontWeight = FontWeight.Bold, modifier = Modifier.width(100.dp))
                    Text(text = "ikmalakbar0017@gmail.com")
                }
            }
        }
        
        Spacer(modifier = Modifier.height(12.dp))
        
        Card (
            modifier = Modifier.size(width = 350.dp, height = 80.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White),
            elevation = CardDefaults.elevatedCardElevation(2.dp)
        ){
            Column (
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 12.dp, end = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = "Asal PT: ", fontWeight = FontWeight.Bold, modifier = Modifier.width(100.dp))
                    Text(text = "Politeknik Negeri Batam")
                }
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        Card (
            modifier = Modifier.size(width = 350.dp, height = 80.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White),
            elevation = CardDefaults.elevatedCardElevation(2.dp)
        ){
            Column (
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 12.dp, end = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = "Jurusan: ", fontWeight = FontWeight.Bold, modifier = Modifier.width(100.dp))
                    Text(text = "Teknik Informatika")
                }
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        Card (
            modifier = Modifier.size(width = 350.dp, height = 200.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White),
            elevation = CardDefaults.elevatedCardElevation(5.dp)
        ){
            Column (
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 12.dp, end = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = "Spek PC: ", fontWeight = FontWeight.Bold, modifier = Modifier.width(100.dp))
                    Text(text = """CPU: Intel core i5-4590
                        |GPU: Gigabyte Nvidia GTX 1070 8GB
                        |RAM: 8GB DDR8
                        |OS: Linux Mint Cinammon
                        |Storage: HDD 500GB
                        |Fav Game: War Thunder
                    """.trimMargin())
                }
            }
        }

        Spacer(modifier = Modifier.height(18.dp))

        Button(
            onClick = {navController.navigate("home")},
            shape = RoundedCornerShape(4.dp),
            elevation = ButtonDefaults.elevatedButtonElevation(5.dp),
            modifier = Modifier.size(width = 280.dp, height = 45.dp)) {
            Text(text = "Ashiap")
        }

    }
}