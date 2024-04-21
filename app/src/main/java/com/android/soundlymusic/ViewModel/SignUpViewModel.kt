package com.android.soundlymusic.ViewModel

import android.widget.Toast
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import com.android.soundlymusic.Api.ApiInterface
import com.android.soundlymusic.models.SignUpRequest

class SignUpViewModel(private val apiInterface: ApiInterface) : ViewModel() {

    suspend fun signUp(email: String, password: String, onSuccess: () -> Unit) {
        try {
            val request = SignUpRequest(email, password)
            val response = apiInterface.signUp(request)

            // Process response
            if (response.success) {
                onSuccess() // Invoke the callback if sign-up is successful
            } else {
                println("enter valid email")
            }
        } catch (e: Exception) {
           println("error");
        }
    }
}

