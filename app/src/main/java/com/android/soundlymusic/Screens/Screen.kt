package com.android.soundlymusic.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.android.soundlymusic.Api.ApiInterface
import com.android.soundlymusic.Components.ButtonComposable
import com.android.soundlymusic.Components.OTPButton
import com.android.soundlymusic.Components.OTPSegmentText
import com.android.soundlymusic.Components.OTPTextFields
import com.android.soundlymusic.Components.SimpleText
import com.android.soundlymusic.Components.ThoughtText
import com.android.soundlymusic.Components.WelcomeImage
import com.android.soundlymusic.Components.displayCard
import com.android.soundlymusic.Components.initialPart
import com.android.soundlymusic.Navigation.Routes
import com.android.soundlymusic.ViewModel.SignUpViewModel
import com.android.soundlymusic.ui.theme.lightblue

@Composable
fun WelcomeScreen(navController: NavHostController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Column {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .background(Color.White)
            )
            ThoughtText()
            SimpleText()
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .background(Color.White)
            )
            WelcomeImage()
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(196.dp)
                    .background(Color.White)
            )
            OTPButton(color = Color.White, navController = navController)


        }
    }
}

@Composable
fun SignUpScreen(navController: NavHostController,viewModel: SignUpViewModel) {
    val signUpViewModel = viewModel<SignUpViewModel>()

    Column {
        initialPart()
        displayCard(navController = navController, viewModel = viewModel)

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .background(lightblue)
                .height(10.dp)
        )
    }
}


@Composable
fun OTPScreen(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Column {

            initialPart("", false)
            Card(
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp))
                    .background(lightblue)
                    .fillMaxWidth(),
            ) {


                OTPSegmentText()
                OTPTextFields(length = 4, onFilled = { })
                Spacer(modifier = Modifier
                    .fillMaxWidth()
                    .background(lightblue)
                    .height(23.dp))
                OTPButton(navController = navController)
                Spacer(modifier = Modifier
                    .fillMaxWidth()
                    .background(lightblue)
                    .height(23.dp))

            }
        }
    }
}

@Preview
@Composable
fun OTPScreenpreview() {
    val navController = rememberNavController()
    OTPScreen(navController)


}