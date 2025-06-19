package com.example.swapi.home.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.swapi.core.network.RetrofitHelper
import com.example.swapi.home.data.network.response.SwapiResponse
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class SwapiViewModel : ViewModel() {
    private val _characters = MutableStateFlow<List<SwapiResponse>>(emptyList())
    val characters: StateFlow<List<SwapiResponse>> = _characters

    fun loadAllCharacters() {
        viewModelScope.launch {
            _characters.value = getAllCharacters()
        }
    }

    suspend fun getAllCharacters(): List<SwapiResponse> {
        val allCharacters = mutableListOf<SwapiResponse>()
        var page = 1
        var hasNext = true

        while (hasNext) {
            val response = RetrofitHelper.swapiApi.getPeoplePage(1)
            return if (response.isSuccessful) response.body() ?: emptyList() else emptyList()

        }
        return allCharacters
    }
}