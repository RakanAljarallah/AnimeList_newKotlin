package com.example.animelist.listofanime.uiLyer.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

import com.example.animelist.R

@Composable
fun AnimeList(name:String) {
    Column() {

        Image(
            painter = painterResource(
                R.drawable.ic_launcher_foreground
            ), contentDescription = "anime image"
        )
        Text(text = name)
    }
}

//@Preview(showBackground = true)
//@Composable
// fun AnimeListPreview() {
//  AnimeList(name = "AOT")
//
//}

