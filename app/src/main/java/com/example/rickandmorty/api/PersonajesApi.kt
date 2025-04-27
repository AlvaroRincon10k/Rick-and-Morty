package com.example.rickandmorty.api

import com.example.rickandmorty.model.ListaPersonajes
import retrofit2.http.GET

interface PersonajesApi {
    @GET("character")
    suspend fun getPersoanjes(): ListaPersonajes
}