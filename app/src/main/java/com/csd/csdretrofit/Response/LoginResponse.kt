package com.csd.csdretrofit.Response

import android.media.session.MediaSession
import com.csd.csdretrofit.Dclass.User

data class LoginResponse(val user: User, val token: MediaSession.Token)

data class LoginRequest(val email: String, val password: String)

data class RegistrationRequest(
    val email: String,
    val name: String,
    val password: String,
    val password_confirmation: String,
    val phone: String,
    val address: String
)

data class UserResponse(val User: User,  val token: MediaSession.Token)

data class EmailCheckRequest(
    val email: String
)