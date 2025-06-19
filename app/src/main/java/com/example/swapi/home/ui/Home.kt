package com.example.swapi.home.ui

import kotlinx.coroutines.runBlocking

fun test() = runBlocking{
    val viewModel = SwapiViewModel()
    viewModel.getSwapi("1")
}

fun main(){
    val json = test()
    println(json)
}