package com.yusufcakmak.composeuitesting.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.yusufcakmak.composeuitesting.R
import com.yusufcakmak.composeuitesting.ui.theme.Typography

@Composable
fun PokemonListScreen() {
    LazyColumn(){
        item {
            PokemonListItem()
        }

        item {
            PokemonListItem()
        }

        item {
            PokemonListItem()
        }
    }
}

@Composable
fun PokemonListItem(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Pokemon Detail",
            style = Typography.body1,
            modifier = Modifier.align(Alignment.CenterHorizontally),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonListScreenPreview() {
    PokemonListScreen()
}