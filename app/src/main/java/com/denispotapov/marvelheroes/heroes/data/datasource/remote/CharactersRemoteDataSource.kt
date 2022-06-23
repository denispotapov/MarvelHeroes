package com.denispotapov.marvelheroes.heroes.data.datasource.remote

import com.denispotapov.marvelheroes.heroes.data.api.MarvelApi
import com.denispotapov.marvelheroes.heroes.data.model.MarvelDto
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class CharactersRemoteDataSource @Inject constructor(
    private val ioDispatcher: CoroutineDispatcher,
    private val marvelApi: MarvelApi
) : CharactersRemoteDataSourceApi {

    override suspend fun getCharacters(): Response<MarvelDto> = withContext(ioDispatcher) {
        marvelApi.getCharacters()
    }

}