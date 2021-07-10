package com.yusufcakmak.composeuitesting.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Vertical
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.decode.SvgDecoder
import com.google.accompanist.coil.rememberCoilPainter
import com.yusufcakmak.composeuitesting.R
import com.yusufcakmak.composeuitesting.ui.data.PokemonDataProvider
import com.yusufcakmak.composeuitesting.ui.theme.ComposeUITestingTheme
import com.yusufcakmak.composeuitesting.ui.theme.Typography

@Composable
fun HomeScreen() {
    ComposeUITestingTheme() {
        PokemonsCard()
    }
}

@Composable
fun PokemonsCard(){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
            .background(colorResource(id = R.color.white))
            .clickable { },
        elevation = 10.dp
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Pokemon List",
                style = Typography.h4,
                modifier = Modifier.padding(16.dp),
            )
        }
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.End
        ) {
            Image(
                painter = rememberCoilPainter(PokemonDataProvider.fetchPokemonList().first().image,
                    imageLoader = ImageLoader.Builder(LocalContext.current)
                        .componentRegistry {
                            add(SvgDecoder(LocalContext.current))
                        }
                        .build()),
                contentDescription = stringResource(R.string.app_name),
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}