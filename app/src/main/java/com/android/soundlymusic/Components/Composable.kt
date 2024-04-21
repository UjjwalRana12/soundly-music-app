package com.android.soundlymusic.Components

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Bottom
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusOrder
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.android.soundlymusic.Navigation.Routes
import com.android.soundlymusic.R
import com.android.soundlymusic.ViewModel.SignUpViewModel
import com.android.soundlymusic.ui.theme.Mainblue
import com.android.soundlymusic.ui.theme.lightblue
import kotlinx.coroutines.launch


val fontFamily = FontFamily(
    Font(R.font.mediumfont)
)

@Composable
fun ButtonComposable(
    color: Color = lightblue,
    text: String = "Get Started",
    destination: Routes = Routes.SignUpRoutes,
    viewModel: SignUpViewModel,
    navController: NavController,
    onClick: suspend () -> Unit
) {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color)
            .padding(vertical = 16.dp)


    ) {
        Button(onClick = {
            viewModel.viewModelScope.launch {

                onClick()
            }
        },
            shape = MaterialTheme.shapes.medium,
            colors = ButtonDefaults.buttonColors(Mainblue),
            modifier = Modifier
                .align(Alignment.Center)
                .height(56.dp)
                .width(320.dp)
                .clickable { }
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontFamily = fontFamily
                )
                Icon(
                    painter = painterResource(id = R.drawable.baseline_keyboard_arrow_right_24),
                    contentDescription = "left arrow",
                    tint = Color.White
                )

            }

        }
    }
}

@Composable
fun ThoughtText(
    text: String = " Cleaner",
) {
    Box(
        modifier =
        Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Black,
                        fontSize = 24.sp,
                        fontFamily = fontFamily

                    )
                ) {
                    append("Your Thoughts ")
                }


                withStyle(
                    style = SpanStyle(
                        color = Mainblue,
                        fontSize = 24.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Bold,
                        fontFamily = fontFamily

                    )
                ) {
                    append(text)
                }
            },

            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(),
            textAlign = TextAlign.Center,

            )
    }
}

@Composable
fun SimpleText(text: String = "Let the music take control!") {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            fontFamily = fontFamily,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize()
        )


    }
}

@Composable
fun IllustrationImage(isOTP: Boolean = true) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .wrapContentSize()
    ) {
        Image(
            painter = painterResource(
                id = if (isOTP) {
                    R.drawable.base_assests
                } else {
                    (R.drawable.sign_in)
                }
            ), contentDescription = "sign in illustration",
            modifier = Modifier
                .wrapContentSize()
                .align(Alignment.Center)
                .size(width = 224.dp, height = 224.dp)

        )
    }
}

@Composable
fun WelcomeImage() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .wrapContentSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.yoga),
            contentDescription = "sign in illustration",
            modifier = Modifier
                .wrapContentSize()
                .align(Alignment.Center)
                .size(width = 264.dp, height = 264.dp)

        )
    }
}


@Composable
fun Logo() {
    Box(
        modifier = Modifier
            .wrapContentSize()
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .wrapContentSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "S",
                style = TextStyle(
                    color = Mainblue,
                    fontFamily = fontFamily,
                    fontSize = 64.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = "oundly",
                style = TextStyle(
                    color = Color.Black,
                    fontFamily = fontFamily,
                    fontSize = 24.sp
                )
            )
        }
    }
}

@Composable
fun loginText(text: String = "Login") {
    val context = LocalContext.current
    Box(modifier = Modifier
        .wrapContentSize()
        .background(Color.White)
        .padding(end = 5.dp)
        .clickable {
            Toast
                .makeText(context, "navigate to forgot user email world", Toast.LENGTH_SHORT)
                .show()
        }) {
        Text(
            text = text, style = TextStyle(
                color = Mainblue,
                fontSize = 16.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold
            )
        )
    }
}


@Composable
fun welSignInBox(text: String = "Sign Up") {
    Column(modifier = Modifier.fillMaxWidth()) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = text,
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
                    .background(lightblue)
                    .align(Alignment.Center),
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = fontFamily
            )

        }
        WelcomeToSoundly("Soundly")
    }
}


@Composable
fun WelcomeToSoundly(text: String = " Cleaner") {
    Box(
        modifier =
        Modifier
            .fillMaxWidth()
            .background(lightblue)
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Black,
                        fontSize = 24.sp,
                        fontFamily = fontFamily

                    )
                ) {
                    append("Welcome To ")
                }


                withStyle(
                    style = SpanStyle(
                        color = Mainblue,
                        fontSize = 24.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Bold,
                        fontFamily = fontFamily

                    )
                ) {
                    append(text)
                }
            },

            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(),
            textAlign = TextAlign.Center,

            )
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun userEditText(
    text: String,
    onTextChanged: (String) -> Unit,
    upperText: String = "username",
    label: String = "Enter Text",
    onEmailEntered: (String) -> Unit = {}

) {
    var text by remember { mutableStateOf("") }



    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(lightblue)
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 6.dp)
                .fillMaxWidth()
                .background(lightblue),
            verticalArrangement = Arrangement.Center,

            ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = upperText, fontFamily = fontFamily)
            }

            TextField(
                value = text,
                onValueChange = { newText ->
                    text = newText
                },

                label = {
                    Text(
                        label, color = Color.Gray, fontFamily = fontFamily, modifier = Modifier
                            .fillMaxWidth()
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = Color.Black,
                    focusedLabelColor = Mainblue,


                    ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Done
                ),
                singleLine = true,

                modifier = Modifier
                    .fillMaxWidth()
                    .background(lightblue)
                    .clip(RoundedCornerShape(8.dp))
                    .border(width = 1.dp, color = Color.Gray), shape = RoundedCornerShape(8.dp)
            )

        }
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OTPTextFields(
    modifier: Modifier = Modifier,
    length: Int,
    onFilled: (code: String) -> Unit
) {
    var code by remember { mutableStateOf(List(length) { "" }) }
    val focusRequesters = List(length) { FocusRequester() }



    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(lightblue), contentAlignment = Alignment.Center
    ) {


        Column(
            modifier = modifier
                .wrapContentSize()
                .background(lightblue)
        ) {

            Row {
                code.indices.forEach { index ->
                    OutlinedTextField(
                        value = code[index],
                        onValueChange = { value ->
                            val newCode = code.toMutableList()
                            if (value.length <= 1) { // Ensure single character
                                newCode[index] = value
                                code = newCode
                                if (value.isNotEmpty() && index < length - 1) {
                                    focusRequesters[index + 1].requestFocus()
                                }
                                if (value.isEmpty() && index > 0) {
                                    focusRequesters[index - 1].requestFocus()
                                }
                            }
                        },

                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Number,
                            imeAction = if (index == length - 1) ImeAction.Done else ImeAction.Next
                        ),
                        singleLine = true,
                        textStyle = MaterialTheme.typography.bodySmall.copy(
                            textAlign = TextAlign.Center,
                            color = Color.Black
                        ),
                        modifier = modifier
                            .clip(RoundedCornerShape(12.dp))
                            .width(50.dp)
                            .height(50.dp)
                            .focusOrder(focusRequesters[index]),
                    )
                    if (index < length - 1)
                        Spacer(modifier = Modifier.width(15.dp))
                }
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(lightblue)
                    .height(3.dp)
            )
            Row {
                Text(
                    text = "Resend OTP",
                    color = Color.Black,
                    modifier = Modifier
                        .align(Bottom)
                        .size(12.dp)
                )
            }
        }
    }
}

@Composable
fun OTPButton(
    color: Color= lightblue,
    text: String="Get Started",
    destination:Routes=Routes.SignUpRoutes,
    navController: NavController)
{
    val context = LocalContext.current
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(lightblue)
        .padding(vertical = 16.dp)


    ){
        Button(onClick = { navController.navigate(destination.routes) },
            shape = MaterialTheme.shapes.medium,
            colors=  ButtonDefaults.buttonColors(Mainblue),
            modifier = Modifier
                .align(Center)
                .height(56.dp)
                .width(320.dp)
                .clickable { }
        ) {

            Row(verticalAlignment = CenterVertically) {
                Text(text, color = Color.White, fontWeight = FontWeight.Bold ,fontFamily= fontFamily)
                Icon(painter = painterResource(id = R.drawable.baseline_keyboard_arrow_right_24), contentDescription = "left arrow",tint = Color.White)

            }

        }
    }
}



@Preview
@Composable
fun previewotp() {
    OTPTextFields(length = 4, onFilled = { })
}





