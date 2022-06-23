package com.denispotapov.marvelheroes.heroes.data.datasource.remote

import com.denispotapov.marvelheroes.heroes.data.model.MarvelDto
import retrofit2.Response

interface CharactersRemoteDataSourceApi {

    suspend fun getCharacters(): Response<MarvelDto>

}