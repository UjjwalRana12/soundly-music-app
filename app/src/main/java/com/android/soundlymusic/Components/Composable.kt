package com.android.soundlymusic.Components
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.android.soundlymusic.Navigation.Routes
import com.android.soundlymusic.R
import com.android.soundlymusic.ui.theme.Mainblue







val fontFamily=FontFamily(
    Font(R.font.mediumfont)
)


@Composable
fun ThoughtText(
    text: String = " Cleaner",
    ) {
    Box(modifier =
    Modifier
        .fillMaxWidth()
        .background(Color.White)
    ) {
        Text(text = buildAnnotatedString {
            withStyle(style = SpanStyle(
                color= Color.Black,
                fontSize = 24.sp,
                fontFamily= fontFamily

            )
            ){
                append("Your Thoughts ")
            }


            withStyle(style = SpanStyle(
                color = Mainblue,
                fontSize = 24.sp,
                fontStyle =  FontStyle.Normal,
                fontWeight = FontWeight.Bold,
                fontFamily= fontFamily

            )) {
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
fun SimpleText(text: String="Let the music take control!"){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)
    ){
        Text(text = text,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            fontFamily= fontFamily,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize()
        )


    }
}

@Composable
fun Button(
    text: String="Get Started",
    destination:String="",
    navController: NavController)
{
    val context = LocalContext.current
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)


    ){
        Button(onClick = { navController.navigate(Routes.SignUpRoutes.routes) },
            shape = MaterialTheme.shapes.medium,
            colors=  ButtonDefaults.buttonColors(Mainblue),
            modifier = Modifier.align(Center).height(56.dp).width(320.dp).clickable {  }
        ) {

            Row(verticalAlignment = CenterVertically) {
                Text(text, color = Color.White, fontWeight = FontWeight.Bold ,fontFamily= fontFamily)
                Icon(painter = painterResource(id = R.drawable.baseline_keyboard_arrow_right_24), contentDescription = "left arrow",tint = Color.White)

            }

        }
    }
}

@Composable
fun IllustrationImage(isOTP:Boolean = true){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)
        .wrapContentSize()){
        Image(painter = painterResource(id =if(isOTP){R.drawable.base_assests} else {(R.drawable.sign_in)}), contentDescription = "sign in illustration",
            modifier = Modifier
                .wrapContentSize()
                .align(Alignment.Center)
                .size(width = 264.dp, height = 264.dp)

        )
    }
}

@Composable
fun WelcomeImage(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)
        .wrapContentSize()){
        Image(painter = painterResource(id =R.drawable.yoga), contentDescription = "sign in illustration",
            modifier = Modifier
                .wrapContentSize()
                .align(Alignment.Center)
                .size(width = 264.dp, height = 264.dp)

        )
    }
}