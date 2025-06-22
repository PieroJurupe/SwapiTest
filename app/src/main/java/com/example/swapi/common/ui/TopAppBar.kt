package com.example.swapi.common.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.swapi.R
import com.example.swapi.ui.theme.TopAppBarColor
import com.example.swapi.ui.theme.YellowText

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PrincipalTopAppBar(modifier: Modifier = Modifier) {
    TopAppBar( modifier = Modifier,
        title = {
            Column(modifier = Modifier.padding(0.dp), horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.spacedBy(-5.dp)) {
            Text(
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                modifier = Modifier.padding(0.dp),
                text = "STAR WARS",)
            Text(
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                text = "WIKI",
                modifier = Modifier.padding(0.dp).align(Alignment.CenterHorizontally))
            }
        },
        actions = {
            Icon(
                painter = painterResource(id = R.drawable.search_icon),
                contentDescription = "Search",
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = TopAppBarColor,
            titleContentColor = YellowText,
            actionIconContentColor = Color.White,
        )
        )
}