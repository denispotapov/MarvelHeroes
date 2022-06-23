package com.denispotapov.marvelheroes.heroes.data.api

import com.denispotapov.marvelheroes.heroes.data.model.MarvelDto
import retrofit2.Response

interface MarvelApi {

    suspend fun getCharacters(): Response<MarvelDto>

}