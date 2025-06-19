package com.example.swapi.home.ui

import com.example.swapi.core.network.RetrofitHelper

class SwapiViewModel {
    val swapiUseCase = RetrofitHelper.swapiApi::doSwapi

    suspend fun getSwapi(id: String) = swapiUseCase(id).let { response ->
        if (response.isSuccessful) {
            val character = response.body()
            println("Character: ${character?.name}")
        } else {
            "Error: ${response.errorBody()?.string() ?: "Unknown error"}"
        }
    }

}