package com.denispotapov.marvelheroes.heroes.data.model

import com.google.gson.annotations.SerializedName

data class StoriesDto(
    @SerializedName("available") val available: String,
    @SerializedName("collectionURI") val collectionURI: String,
    @SerializedName("items") val items: List<ItemXXX>,
    @SerializedName("returned") val returned: String
)