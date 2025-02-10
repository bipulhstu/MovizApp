package com.bipulhstu.movizapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.bipulhstu.movizapp.repository.MovieRepository
import com.bipulhstu.movizapp.screens.MovieScreen
import com.bipulhstu.movizapp.ui.theme.MovizAppTheme
import com.bipulhstu.movizapp.viewmodel.MovieViewModel
import com.bipulhstu.movizapp.viewmodel.MovieViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // repository
        var repository = MovieRepository()

        // view model factory
        val viewModelFactory = MovieViewModelFactory(repository)

        // view model
        val movieViewModel = ViewModelProvider(
            this,
            viewModelFactory
        )[MovieViewModel::class.java]

        setContent {
            MovizAppTheme {
               MovieScreen(movieViewModel)
            }
        }
    }
}