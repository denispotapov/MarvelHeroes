package com.denispotapov.marvelheroes.heroes.data.repository

import com.denispotapov.marvelheroes.heroes.data.model.MarvelDto
import retrofit2.Response

interface CharacterRepositoryApi {

    suspend fun getCharacters(): Response<MarvelDto>

}