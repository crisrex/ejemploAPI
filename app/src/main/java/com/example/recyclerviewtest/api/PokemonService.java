package com.example.recyclerviewtest.api;


import com.example.recyclerviewtest.modelos.Resultado;

import retrofit2.Call;
import retrofit2.http.GET;

//TODO: (3) Definimos una interfaz
public interface PokemonService {

    //TODO: (4) Defino en una constante la URL de la API
    final static String POKEMONURL = "https://pokeapi.co/api/v2/";

    //TODO: (5) Defino una función que me devolverá el listado de Pokemons en la URL /pokemon
    @GET("pokemon")
    Call<Resultado> getPokemons();
}
