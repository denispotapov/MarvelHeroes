package com.denispotapov.marvelheroes.heroes.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.denispotapov.marvelheroes.heroes.domain.model.Character
import kotlinx.coroutines.flow.Flow

@Dao
interface CharacterDao {

    @Query("SELECT * FROM characters")
    fun getCharacters(): Flow<List<Character>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCharacter(character: Character)

}
