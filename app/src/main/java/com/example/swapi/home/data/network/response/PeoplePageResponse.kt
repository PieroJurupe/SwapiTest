package com.example.swapi.home.data.network.response

import com.google.gson.annotations.SerializedName

data class PeoplePageResponse (
    @SerializedName("results") val results: List<SwapiResponse>,
    @SerializedName("next") val next: String?
)