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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.android.soundlymusic.Navigation.Routes
import com.android.soundlymusic.R
import com.android.soundlymusic.ViewModel.SignUpViewModel
import com.android.soundlymusic.ui.theme.lightblue

@Composable
fun initialPart(loginText: String = "login", illustrationImage: Boolean = false) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_keyboard_arrow_left_24),
                    contentDescription = "back button"
                )

                Logo()
                loginText(loginText)

            }
            IllustrationImage(illustrationImage)
            Spacer(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .height(10.dp)
            )
        }

    }
}


@Composable
fun displayCard(navController: NavController, viewModel: SignUpViewModel) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Card(
            modifier = Modifier
                .clip(RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp))
                .background(lightblue)
                .fillMaxWidth(),
        ) {

            welSignInBox()

            val emailState = remember { mutableStateOf("") }
            val usernameState = remember { mutableStateOf("") }

            userEditText(
                text = usernameState.value,
                onTextChanged = { usernameState.value = it },
                upperText = "Username",
                label = "Enter your username"
            )

            userEditText(
                text = emailState.value,
                onTextChanged = { emailState.value = it },
                upperText = "Username",
                label = "Enter your username"
            )

            ButtonComposable(
                destination = Routes.OtpRoutes,
                navController = navController,
                viewModel = viewModel,
                onClick = suspend {
                    val email = emailState.value
                    val username = usernameState.value
                    viewModel.signUp(username, email) {
                        navController.navigate(Routes.OtpRoutes.routes)
                    }
                }

            )

        }
    }
}

@Composable
fun OTPSegmentText() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(lightblue)
        ) {

            Spacer(modifier = Modifier
                .fillMaxWidth()
                .background(lightblue)
                .height(26.dp))
            Text(
                text = "Enter OTP",
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
                    .background(lightblue)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = fontFamily
            )

            Text(
                text = "Please enter the 4 - digit code sent to you at",
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
                    .background(lightblue)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontSize = 12.sp,
                fontFamily = fontFamily
            )
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .background(lightblue)
                .height(15.dp))
            Text(
                text = "+91 8888889887",
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
                    .background(lightblue)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontSize = 24.sp,
                fontFamily = fontFamily
            )
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .background(lightblue)
                .height(25.dp))

        }
    }
}


@Composable
fun OTPCard(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Card(
            modifier = Modifier
                .clip(RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp))
                .background(lightblue)
                .fillMaxWidth(),
        ) {

            OTPSegmentText()
            OTPTextFields(length = 4, onFilled = { })
           OTPButton(navController = navController,)

        }
    }
}

@Preview
@Composable
fun previewthis() {
    val navController = rememberNavController()


}
