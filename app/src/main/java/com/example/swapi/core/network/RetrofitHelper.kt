package com.example.swapi.core.network

import com.example.swapi.home.data.network.SwapiClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private val retrofit = Retrofit.Builder()
            .baseUrl("https://swapi.info/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    val swapiApi: SwapiClient = retrofit.create(SwapiClient::class.java)
    }