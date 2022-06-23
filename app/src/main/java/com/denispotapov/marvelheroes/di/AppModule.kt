package com.denispotapov.marvelheroes.di

import android.content.Context
import androidx.room.Room
import com.denispotapov.marvelheroes.BuildConfig
import com.denispotapov.marvelheroes.heroes.data.api.MarvelApi
import com.denispotapov.marvelheroes.heroes.data.db.CharacterDao
import com.denispotapov.marvelheroes.heroes.data.db.CharactersDatabase
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideIoDispatcher(): CoroutineDispatcher = Dispatchers.IO

    @Singleton
    @Provides
    fun provideVkDatabase(context: Context): CharactersDatabase = Room.databaseBuilder(
        context,
        CharactersDatabase::class.java,
        CharactersDatabase.DATABASE_NAME
    )
        .build()

    @Singleton
    @Provides
    fun provideCharacterDao(charactersDatabase: CharactersDatabase): CharacterDao = charactersDatabase.characterDao()


    @Singleton
    @Provides
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor()
        .setLevel(if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE)

    @Singleton
    @Provides
    fun provideOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()

    @Singleton
    @Provides
    fun provideVkApiService(okHttpClient: OkHttpClient): MarvelApi = Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl("https://gateway.marvel.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(MarvelApi::class.java)

}