package com.bipulhstu.movizapp.repository

import com.bipulhstu.movizapp.retrofit.Movie
import com.bipulhstu.movizapp.retrofit.RetrofitInstance

// Repository: Manages data operations & abstract the data sources.
// Acts as a bridge between different data source (online DB, local DB..)
// and the rest of the app.
class MovieRepository {

    //Fetching data from online API
    suspend fun getPopularMoviesFromOnlineApi(apiKey: String) : List<Movie>{
        return RetrofitInstance.api.getPopularMovies(apiKey).results
    }
}