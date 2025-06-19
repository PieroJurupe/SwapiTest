package com.example.swapi.home.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.runBlocking
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.swapi.home.data.network.response.SwapiResponse


@Composable
fun Home(modifier: Modifier) {
    val swapiViewModel : SwapiViewModel = viewModel()
    val characters by swapiViewModel.characters.collectAsState()

    LaunchedEffect(Unit) {
        swapiViewModel.loadAllCharacters()
    }
    CharactersScreen(characters = characters, modifier = modifier)
}


@Composable
fun  CharactersScreen(characters: List<SwapiResponse>, modifier: Modifier) {
    LazyColumn(modifier = modifier.padding(16.dp)) {
        items(characters) { character ->
            Column(modifier = Modifier.padding(vertical = 8.dp)) {
                Text(text = "Nombre: ${character.name}")
                Text(text = "Altura: ${character.height}")
            }
        }
    }
}