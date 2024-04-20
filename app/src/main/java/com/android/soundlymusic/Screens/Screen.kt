package com.android.soundlymusic.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.android.soundlymusic.Components.Button
import com.android.soundlymusic.Components.SimpleText
import com.android.soundlymusic.Components.ThoughtText
import com.android.soundlymusic.Components.WelcomeImage
import com.android.soundlymusic.Components.displayCard
import com.android.soundlymusic.Components.initialPart
import com.android.soundlymusic.ui.theme.lightblue

@Composable
fun WelcomeScreen(navController: NavHostController) {

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)){

        Column {
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(Color.White))
            ThoughtText()
            SimpleText()
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(Color.White))
            WelcomeImage()
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(96.dp)
                .background(Color.White))
            Button(navController = navController)
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(Color.White))

        }
    }
}

@Composable
fun SignUpScreen(navController: NavHostController) {

    Column {
        initialPart()
        displayCard(navController = navController)

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .background(lightblue)
            .height(10.dp))
    }
}



