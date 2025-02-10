package com.bipulhstu.movizapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bipulhstu.movizapp.repository.MovieRepository

// Factory Classes used to create instances of 'MovieViewModel',
// especially when 'MovieViewModel; requires dependencies that
// need to be passed during its creation, such as a repository
class MovieViewModelFactory (private val repository: MovieRepository)
    : ViewModelProvider.Factory {


        override fun <T : ViewModel> create(modelClass: Class<T>): T {

            if(modelClass.isAssignableFrom(MovieViewModel::class.java)){

                @Suppress("UNCHECKED_CAST")
                return MovieViewModel(repository) as T
            }

            throw IllegalArgumentException("Unknown View Model Class")


        return super.create(modelClass)
    }
}