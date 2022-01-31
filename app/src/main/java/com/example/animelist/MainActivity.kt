package com.example.animelist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.animelist.listofanime.uiLyer.ui.AnimeList
import com.example.animelist.ui.theme.AnimeListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                AnimeList(name = "AOT")

                Greeting("Android")
            }
                // A surface container using the 'background' color from the theme
            
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row {
        Image(painter = painterResource(
            id = R.drawable.ic_launcher_foreground),
            contentDescription = "Kotlin")


        Column {
            Text(text = "Hello $name!")
            Text("welcome Kotlin class $name")
        }
    }
}

//@Composable
//fun Heloo(names: String) {
//
//}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AnimeListTheme {
        Greeting("Android")
    }
}

