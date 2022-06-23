package com.denispotapov.marvelheroes.heroes.data.model

import com.google.gson.annotations.SerializedName

data class MarvelDto(
    @SerializedName("attributionHTML") val attributionHTML: String,
    @SerializedName("attributionText") val attributionText: String,
    @SerializedName("code") val code: String,
    @SerializedName("copyright") val copyright: String,
    @SerializedName("data") val data: DataDto,
    @SerializedName("etag") val SerializedName: String,
    @SerializedName("status") val status: String
)