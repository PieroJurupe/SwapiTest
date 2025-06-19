package com.example.swapi.home.data.network

import com.example.swapi.home.data.network.response.PeoplePageResponse
import com.example.swapi.home.data.network.response.SwapiResponse
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path

interface SwapiClient {
    @GET("people/")
    suspend fun getPeoplePage(@retrofit2.http.Query("page") page : Int = 1): retrofit2.Response<List<SwapiResponse>>
}