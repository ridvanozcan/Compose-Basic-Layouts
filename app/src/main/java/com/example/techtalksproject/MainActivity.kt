package com.example.techtalksproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.techtalksproject.ui.theme.TechTalksProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TechTalksProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Card()
                }
            }
        }
    }
}

@Composable
fun Card() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        FirstItem()
        SecondItem()
        ThirdItem()
        FourthItem()
    }
}

@Composable
fun FirstItem() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Image(
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.sahibinden),
                contentDescription = "Sahibinden logo"
            )
            Column {
                Text(
                    text = "Mr.softwareengineer",
                    style = TextStyle(
                        fontSize = 16.sp,
                        color = Color.Red,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "sahibinden.com!a hoşgeldiniz",
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Normal
                    )
                )
            }
        }
        Image(
            painter = painterResource(id = R.drawable.dots),
            contentDescription = "üç konta"
        )
    }
}

@Composable
fun SecondItem() {
    Text(text = "Herkese merhaba", style = TextStyle(fontSize = 16.sp))
}

@Composable
fun ThirdItem() {
    Box() {
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id = R.drawable.sahibinden_banner),
            contentDescription = "banner"
        )

        Text(
            modifier = Modifier
                .padding(40.dp)
                .background(Color.Black)
                .padding(10.dp), text = "Rıdvan Özcan",
            style = TextStyle(fontSize = 15.sp, color = Color.White)
        )
    }
}

@Composable
fun FourthItem() {
    Row(modifier = Modifier.fillMaxWidth()) {
        val items = listOf(
            Item(R.drawable.uparrow, "1231"),
            Item(R.drawable.comment, "123"),
            Item(R.drawable.share, "Share"),
            Item(R.drawable.share, "Award"),
        )

        items.forEach { item ->
            Row(modifier = Modifier.weight(1f)) {
                Image(
                    modifier = Modifier.size(25.dp),
                    painter = painterResource(id = item.image),
                    contentDescription = "dsad"
                )

                Text(text = item.text)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TechTalksProjectTheme {

    }
}

data class Item(val image: Int, val text: String)