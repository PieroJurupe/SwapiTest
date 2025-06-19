package com.example.swapi.home.data

class SwapiRepository {
    private val api = SwapiService()

    suspend fun doSwapi(id: String): String {
        return api.doSwapi(id)
    }
}