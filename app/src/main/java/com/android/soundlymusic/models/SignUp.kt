package com.android.soundlymusic.models

data class SignUpRequest(
    val user: String,
    val email: String
)
data class SignUpResponse(
    val success: Boolean,
    val message: String?
)