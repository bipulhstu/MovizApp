package com.bipulhstu.movizapp.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// A singleton object that provides a centralized
// & consistent configuration for making network
// requests using retrofit

// Object: Defines a singleton, initialized once
object RetrofitInstance {

    private const val BASE_URL = "https://api.themoviedb.org/3/"

    val api: ApiService by lazy {
        // by lazy: delays the initialization of the property
        //until it is first accessed.

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(ApiService::class.java)

    }
}