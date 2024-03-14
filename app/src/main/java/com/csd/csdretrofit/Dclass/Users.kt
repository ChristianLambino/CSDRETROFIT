package com.csd.csdretrofit.Dclass

data class User(
    val user: UsersList,
    val token: Token
)

data class Token(
    val name: String,
    val abilities: List<String>,
    val expires_at: Any?,
    val tokenable_id: Int,
    val tokenable_type: String,
    val updated_at: String,
    val created_at: String,
    val id: Int
)