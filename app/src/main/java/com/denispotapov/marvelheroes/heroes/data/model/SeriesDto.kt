package com.denispotapov.marvelheroes.heroes.data.model

import com.google.gson.annotations.SerializedName

data class SeriesDto(
    @SerializedName("available") val available: String,
    @SerializedName("collectionURI") val collectionURI: String,
    @SerializedName("items") val items: List<ItemXX>,
    @SerializedName("returned") val returned: String
)