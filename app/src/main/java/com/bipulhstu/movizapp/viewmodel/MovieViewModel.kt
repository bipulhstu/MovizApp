package com.bipulhstu.movizapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bipulhstu.movizapp.repository.MovieRepository
import com.bipulhstu.movizapp.retrofit.Movie
import kotlinx.coroutines.launch

// ViewModel: Stores & Manages UI-related Data
//            Surviving configuration changes
class MovieViewModel(repository: MovieRepository) : ViewModel() {

    // ViewModel uses MutableStateOf<> instead of LiveData
    // Allowing direct Compose state handling

    // When the value of 'movies' changes, Compose will
    // automatically recompose the parts of the UI that depend on this state
    var movies by mutableStateOf<List<Movie>>(emptyList())
        private set


    // The Online Movies
    private var moviesFromApi by mutableStateOf<List<Movie>>(emptyList())
        private set

    // View Model Scope: Launch a coroutine in the scope of ViewModel,
    // which means that coroutine will be tied to
    // the lifecycle of the viewmodel

    init {
        viewModelScope.launch {

            try {
                moviesFromApi = repository.getPopularMoviesFromOnlineApi("ea797609e7eeccca4580a126a61d97c4")

                // Assigning 'movies' to MoviesFromApi
                movies = moviesFromApi
            } catch (e: Exception){
                // Fetch the data from Room DB

            }
        }
    }

}