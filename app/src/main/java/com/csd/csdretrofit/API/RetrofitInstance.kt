package com.csd.csdretrofit.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val URL = "https://cyberservice-96805b7c1a96.herokuapp.com/"

    val APi:API by lazy {
        Retrofit.Builder(URL)
            .baseUrl()
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(APi::class.java)
    }
}