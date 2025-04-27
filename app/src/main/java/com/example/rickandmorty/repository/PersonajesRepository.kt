package com.example.rickandmorty.repository

import com.example.rickandmorty.api.PersonajesApi
import com.example.rickandmorty.model.ListaPersonajes
import javax.inject.Inject

class PersonajesRepository @Inject constructor(
    private val personajesApi: PersonajesApi
) {
    suspend fun getPersonasjes(): ListaPersonajes {
        return personajesApi.getPersoanjes()
    }
}