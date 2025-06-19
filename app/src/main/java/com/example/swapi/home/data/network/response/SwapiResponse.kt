package com.example.swapi.home.data.network.response

import com.google.gson.annotations.SerializedName

data class SwapiResponse(@SerializedName("name") val name:String,
                         @SerializedName("height") val height:String,
                         @SerializedName("mass") val mass:String,
                         @SerializedName("hair_color") val hairColor:String,
                         @SerializedName("skin_color") val skinColor:String,)