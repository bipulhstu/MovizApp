package com.bipulhstu.movizapp.screens

import androidx.compose.runtime.Composable
import com.bipulhstu.movizapp.viewmodel.MovieViewModel

@Composable
fun MovieScreen(viewModel: MovieViewModel){

    // no need for observeAsState, we're not using
    // LiveData, we're using MutableStateOf

    val moviesList = viewModel.movies
    MovieList(moviesList)
}