package com.example.swapi.home.data.network

import com.example.swapi.home.data.network.response.SwapiResponse
import retrofit2.Response
import retrofit2.http.GET

interface SwapiClient {
    @GET("people/{id}")
    suspend fun doSwapi(id: String): Response<SwapiResponse>
}