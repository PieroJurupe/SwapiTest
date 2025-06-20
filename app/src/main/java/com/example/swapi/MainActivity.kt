package com.example.swapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.swapi.common.ui.PrincipalTopAppBar
import com.example.swapi.home.ui.Home
import com.example.swapi.ui.theme.SwapiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SwapiTheme {
                Scaffold(modifier = Modifier.fillMaxSize(), topBar = {PrincipalTopAppBar()}) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding), contentAlignment = Alignment.Center){
                        Home(modifier = Modifier.padding(innerPadding))
                    }
                }
            }
        }
    }
}

