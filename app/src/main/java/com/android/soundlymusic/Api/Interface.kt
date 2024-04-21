package com.android.soundlymusic.Api

import com.android.soundlymusic.models.SignUpRequest
import com.android.soundlymusic.models.SignUpResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {

    @POST("register/email/")
    suspend fun signUp(@Body request: SignUpRequest):SignUpResponse
}