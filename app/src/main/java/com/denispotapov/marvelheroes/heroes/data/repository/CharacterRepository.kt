package com.denispotapov.marvelheroes.heroes.data.repository

import com.denispotapov.marvelheroes.heroes.data.datasource.remote.CharactersRemoteDataSourceApi
import com.denispotapov.marvelheroes.heroes.data.model.MarvelDto
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class CharacterRepository @Inject constructor(
    private val ioDispatcher: CoroutineDispatcher,
    private val charactersRemoteDataSourceApi: CharactersRemoteDataSourceApi
) : CharacterRepositoryApi {

    override suspend fun getCharacters(): Response<MarvelDto> = withContext(ioDispatcher) {
        charactersRemoteDataSourceApi.getCharacters()
    }

}