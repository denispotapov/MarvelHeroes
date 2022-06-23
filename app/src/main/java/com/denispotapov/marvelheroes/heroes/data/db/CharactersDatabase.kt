package com.denispotapov.marvelheroes.heroes.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.denispotapov.marvelheroes.heroes.domain.model.Character

@Database(entities = [Character::class], version = 1)
abstract class CharactersDatabase : RoomDatabase() {

    abstract fun characterDao(): CharacterDao

    companion object {

        const val DATABASE_NAME: String = "characters_db"

    }

}