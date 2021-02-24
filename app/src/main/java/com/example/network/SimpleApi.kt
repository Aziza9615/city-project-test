package com.example.network

import com.example.citysproject.model.City
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SimpleApi {
    @GET("capital/{city}")
    fun fetchCity(@Path("city") city: String): Call<MutableList<City>>
}

