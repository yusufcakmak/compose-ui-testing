package com.yusufcakmak.composeuitesting.ui.data

object PokemonDataProvider {

    fun fetchPokemonList() : List<Pokemon>{
        val pokemonList = mutableListOf<Pokemon>()
        pokemonList.add(Pokemon("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/25.svg","Pikachu","electric"))
        pokemonList.add(Pokemon("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/1.svg","Bulbasaur","grass"))
        pokemonList.add(Pokemon("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/4.svg","Charmander","fire"))
        pokemonList.add(Pokemon("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/7.svg","Squirtle","water"))

        return pokemonList
    }

}

data class Pokemon(
    val image: String,
    val name: String,
    val type: String
)