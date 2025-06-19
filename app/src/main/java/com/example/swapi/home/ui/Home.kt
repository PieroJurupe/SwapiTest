package com.example.swapi.home.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.runBlocking
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.swapi.R
import com.example.swapi.home.data.network.response.SwapiResponse
import com.example.swapi.ui.theme.YellowText


@Composable
fun Home(modifier: Modifier) {
    val swapiViewModel : SwapiViewModel = viewModel()
    val characters by swapiViewModel.characters.collectAsState()

    LaunchedEffect(Unit) {
        swapiViewModel.loadAllCharacters()
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.estrellas),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )
        CharactersScreen(characters = characters, modifier = Modifier.fillMaxSize())
    }}


@Composable
fun  CharactersScreen(characters: List<SwapiResponse>, modifier: Modifier) {
    LazyColumn(modifier = modifier.padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            items(characters) { character ->
                Column(modifier = Modifier
                        .padding(vertical = 8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                    Card(
                        modifier = Modifier.height(300.dp).width(200.dp).clip(RoundedCornerShape(20.dp)).clickable{},
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Black
                        )
                    ) {
                        Column(modifier=Modifier.fillMaxSize().padding(8.dp,0.dp,8.dp,8.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painter = painterResource(R.drawable.card),
                                contentDescription = "Star Wars Character",
                                modifier = Modifier.size(260.dp)
                                    .clip(RoundedCornerShape(20.dp))
                                    .padding(0.dp),
                                contentScale = ContentScale.Fit)
                            Text(text = character.name, modifier = Modifier.padding(top = 2.dp, bottom = 8.dp).align(Alignment.CenterHorizontally), color = YellowText, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
    }
