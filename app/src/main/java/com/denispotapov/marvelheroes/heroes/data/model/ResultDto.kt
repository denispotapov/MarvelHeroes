package com.denispotapov.marvelheroes.heroes.data.model

import com.google.gson.annotations.SerializedName

data class ResultDto(
    @SerializedName("id") val id: String,
    @SerializedName("comics") val comics: ComicsDto,
    @SerializedName("description") val description: String,
    @SerializedName("events") val events: EventsDto,
    @SerializedName("modified") val modified: String,
    @SerializedName("name") val name: String,
    @SerializedName("resourceURI") val resourceURI: String,
    @SerializedName("series") val series: SeriesDto,
    @SerializedName("stories") val stories: StoriesDto,
    @SerializedName("thumbnail") val thumbnail: ThumbnailDto,
    @SerializedName("urls") val urls: List<UrlDto>
)