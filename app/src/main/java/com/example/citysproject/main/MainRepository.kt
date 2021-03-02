package com.example.citysproject.main

import com.example.citysproject.city.RequestResult
import com.example.citysproject.data.local.App.Companion.getDatabase
import com.example.citysproject.data.model.City
import com.example.citysproject.data.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainRepository(private val callback: RequestResult) {

    private var api = RetrofitClient().simpleApi
    private val database = getDatabase().CityDao()

    fun fetchCity(city: String) {
        api.fetchCity(city).enqueue(object : Callback<MutableList<City>> {

            override fun onFailure(call: Call<MutableList<City>>, t: Throwable) {
                return callback.onFailure(t.message.toString())
            }

            override fun onResponse(
                    call: Call<MutableList<City>>,
                    response: Response<MutableList<City>>
            ) {
                return if (response.body() != null) callback.onSuccess(response.body()!!)
                else callback.onFailure("error")
            }
        })
    }

    fun fetchFavorites() {
        callback.onSuccess(database.fetchFavorites() as MutableList<City>)
    }

//    fun InsertFavoretes() {
//        database.InsertFavorites()
//    }
}