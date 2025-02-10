package com.bipulhstu.movizapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.bipulhstu.movizapp.repository.MovieRepository
import com.bipulhstu.movizapp.retrofit.Movie

// ViewModel: Stores & Manages UI-related Data
//            Surviving configuration changes
class MovieViewModel(repository: MovieRepository) : ViewModel() {

    // ViewModel uses MutableStateOf<> instead of LiveData
    // Allowing direct Compose state handling

    // When the value of 'movies' changes, Compose will
    // automatically recompose the parts of the UI that depend on this state
    var movies by mutableStateOf<List<Movie>>(emptyList())
        private set



}