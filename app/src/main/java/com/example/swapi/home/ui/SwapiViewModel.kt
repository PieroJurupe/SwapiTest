package com.example.swapi.home.ui

import com.example.swapi.core.network.RetrofitHelper

class SwapiViewModel {
    val swapiUseCase = RetrofitHelper.swapiApi::doSwapi

    suspend fun getSwapi(id: String):String {
        val response = swapiUseCase(id)
        return if (response.isSuccessful) {
            val character = response.body()
            "Character: ${character?.name}"
        } else {
            "Error: ${response.errorBody()?.string() ?: "Unknown error"}"
        }
    }

}