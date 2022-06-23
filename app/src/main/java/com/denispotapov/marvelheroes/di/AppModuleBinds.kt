package com.denispotapov.marvelheroes.di

import com.denispotapov.marvelheroes.heroes.data.datasource.local.CharactersLocalDataSource
import com.denispotapov.marvelheroes.heroes.data.datasource.local.CharactersLocalDataSourceApi
import com.denispotapov.marvelheroes.heroes.data.datasource.remote.CharactersRemoteDataSource
import com.denispotapov.marvelheroes.heroes.data.datasource.remote.CharactersRemoteDataSourceApi
import com.denispotapov.marvelheroes.heroes.data.repository.CharacterRepository
import com.denispotapov.marvelheroes.heroes.data.repository.CharacterRepositoryApi
import dagger.Binds
import dagger.Module

@Module
interface AppModuleBinds {

   /* @Binds
    fun bindCharactersLocalDataSource(charactersLocalDataSource: CharactersLocalDataSource): CharactersLocalDataSourceApi*/

    @Binds
    fun bindCharacterRemoteDataSource(charactersRemoteDataSource: CharactersRemoteDataSource): CharactersRemoteDataSourceApi

    @Binds
    fun bindCharacterRepository(characterRepository: CharacterRepository): CharacterRepositoryApi

}