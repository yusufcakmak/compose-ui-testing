package com.yusufcakmak.composeuitesting.ui.navigation

import com.yusufcakmak.composeuitesting.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    object Pokemons : NavigationItem("pokemons", R.drawable.ic_home, "Pokemons")
}
