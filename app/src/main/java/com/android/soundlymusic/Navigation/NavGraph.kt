package com.android.soundlymusic.Navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.android.soundlymusic.Screens.OTPScreen
import com.android.soundlymusic.Screens.SignUpScreen
import com.android.soundlymusic.Screens.WelcomeScreen
import com.android.soundlymusic.ViewModel.SignUpViewModel

@Composable
fun NavGraph(){

    val navController = rememberNavController()
    val signUpViewModel = viewModel<SignUpViewModel>()
    NavHost(navController = navController, startDestination = Routes.WelcomeRoutes.routes ){

        composable(route=Routes.WelcomeRoutes.routes){
            WelcomeScreen(navController)
        }

        composable(route=Routes.SignUpRoutes.routes){
           SignUpScreen(navController,viewModel = signUpViewModel)
        }

        composable(route=Routes.OtpRoutes.routes){
            OTPScreen(navController = navController)
        }
    }
}