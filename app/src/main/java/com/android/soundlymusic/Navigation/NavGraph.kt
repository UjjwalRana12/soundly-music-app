package com.android.soundlymusic.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.android.soundlymusic.Screens.SignUpScreen
import com.android.soundlymusic.Screens.WelcomeScreen

@Composable
fun NavGraph(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.WelcomeRoutes.routes ){

        composable(route=Routes.WelcomeRoutes.routes){
            WelcomeScreen(navController)
        }

        composable(route=Routes.SignUpRoutes.routes){
           SignUpScreen()
        }
    }
}