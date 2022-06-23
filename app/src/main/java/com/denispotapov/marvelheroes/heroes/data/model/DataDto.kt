package com.denispotapov.marvelheroes.heroes.data.model

import com.google.gson.annotations.SerializedName

data class DataDto(
    @SerializedName("count") val count: String,
    @SerializedName("limit") val limit: String,
    @SerializedName("offset") val offset: String,
    @SerializedName("results") val results: List<ResultDto>,
    @SerializedName("total") val total: String
)