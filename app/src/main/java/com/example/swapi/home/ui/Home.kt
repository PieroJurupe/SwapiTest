package com.example.swapi.home.ui

import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    val viewModel = SwapiViewModel()
    viewModel.getSwapi("1")
}