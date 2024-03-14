package com.csd.csdretrofit.API


import com.csd.csdretrofit.Response.EmailCheckRequest
import com.csd.csdretrofit.Response.LoginRequest
import com.csd.csdretrofit.Response.LoginResponse
import com.csd.csdretrofit.Response.RegistrationRequest
import com.csd.csdretrofit.Response.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface API {

    @Headers("Accept: application/json") // Specifies the Accept header
    @POST("/registration") // Adjust this endpoint to match your API.
    suspend fun register(@Body registrationRequest: RegistrationRequest): Response<UserResponse>

    @Headers("Accept: application/json")
    @POST("/login")
    suspend fun login(@Body credentials: LoginRequest): Response<LoginResponse>

    @Headers("Accept: application/json")
    @POST("/registration")
    suspend fun checkEmail(@Query("email") emailCheckRequest: EmailCheckRequest): Response<UserResponse>

    @Headers("Accept: application/json")
    @GET("components")
    suspend fun getComponentDetails(): Response<List<ComponentsItems>>


    @Headers("Accept: application/json")
    @GET("/components")
    suspend fun getComponent(): Response<ComponentsItems>
    @Headers("Accept: application/json")
    @POST("/cart")
    suspend fun addToCart(@Body items: ItemRequest): Response<ItemResponse>

}