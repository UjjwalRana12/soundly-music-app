package com.android.soundlymusic.Navigation

sealed class Routes(var routes:String){

    object WelcomeRoutes:Routes("welcome")

    object SignUpRoutes:Routes("signup")

    object OtpRoutes:Routes("otpscreen")

}