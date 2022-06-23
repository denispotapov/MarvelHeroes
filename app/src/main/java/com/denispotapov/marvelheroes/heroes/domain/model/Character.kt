package com.denispotapov.marvelheroes.heroes.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.denispotapov.marvelheroes.heroes.data.model.*

@Entity(tableName = "characters")
data class Character(
    @PrimaryKey(autoGenerate = false) @ColumnInfo(name = "id") val id: String,
   // @ColumnInfo(name = "comics") val comics: ComicsDto,
    @ColumnInfo(name = "description") val description: String,
   // @ColumnInfo(name = "events") val events: EventsDto,
    @ColumnInfo(name = "modified") val modified: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "resourceURI") val resourceURI: String,
    //@ColumnInfo(name = "series") val series: SeriesDto, 
    //@ColumnInfo(name = "stories") val stories: StoriesDto,
    //@ColumnInfo(name = "thumbnail") val thumbnail: ThumbnailDto,
    //@ColumnInfo(name = "urls") val urls: List<UrlDto>
)