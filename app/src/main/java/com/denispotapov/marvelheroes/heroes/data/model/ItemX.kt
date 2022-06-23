package com.denispotapov.marvelheroes.heroes.data.model

import com.google.gson.annotations.SerializedName

data class ItemX(
    @SerializedName("name") val name: String,
    @SerializedName("resourceURI") val resourceURI: String
)