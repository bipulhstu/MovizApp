package com.bipulhstu.movizapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.bipulhstu.movizapp.retrofit.Movie

@Composable
fun MovieList(movies: List<Movie>){

    LazyColumn {
        items(movies){
            // for each 'movie' in 'movies' list,
            // a 'MovieItem' composable is created.
            // 'movie' object is passed as a parameter
            // to the 'MovieItem' composable, allowing
            // it to display the details of the 'movie'

            movie -> MovieItem(movie)
        }
    }
}