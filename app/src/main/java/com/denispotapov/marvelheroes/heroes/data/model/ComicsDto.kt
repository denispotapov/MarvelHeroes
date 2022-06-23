package com.denispotapov.marvelheroes.heroes.data.model

import com.google.gson.annotations.SerializedName

data class ComicsDto(
    @SerializedName("available") val available: String,
    @SerializedName("collectionURI") val collectionURI: String,
    @SerializedName("items") val items: List<Item>,
    @SerializedName("returned") val returned: String
)