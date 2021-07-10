package com.yusufcakmak.composeuitesting.ui.data

object PokemonDataProvider {

    fun fetchPokemonList() : List<Pokemon>{
        val pokemonList = mutableListOf<Pokemon>()
        pokemonList.add(Pokemon("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/25.svg","pikachu","60"))
        pokemonList.add(Pokemon("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/1.svg","bulbasaur","69"))
        pokemonList.add(Pokemon("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/4.svg","charmander","85"))

        return pokemonList
    }

}

data class Pokemon(
    val image: String,
    val name: String,
    val weight: String
)