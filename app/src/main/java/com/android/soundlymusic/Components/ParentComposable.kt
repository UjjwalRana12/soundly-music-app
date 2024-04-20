package com.android.soundlymusic.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.android.soundlymusic.Navigation.Routes
import com.android.soundlymusic.R
import com.android.soundlymusic.ui.theme.lightblue

@Composable
fun initialPart(){

    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)){
        Column {
            Row(modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(painter = painterResource(id = R.drawable.baseline_keyboard_arrow_left_24)
                    , contentDescription = "back button")

                Logo()
                loginText("Login")

            }
            IllustrationImage(isOTP = false)
            Spacer(modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(10.dp))
        }

    }
}






@Composable
fun displayCard(navController: NavController){

    Box(modifier = Modifier
        .fillMaxWidth()
        .background(lightblue)){
        Card(modifier = Modifier
            .clip(RoundedCornerShape(topStart = 18.dp, topEnd = 18.dp))
            .background(lightblue)
            .fillMaxWidth(),
            shape = RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp),

            ) {

            welSignInBox()
            userEditText("username","Enter Text","")
            userEditText("Email","Enter Email","")
            Button(destination = Routes.WelcomeRoutes, navController = navController)

        }
    }
}

@Preview
@Composable
fun previewthis(){

}
