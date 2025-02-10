package com.bipulhstu.movizapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.bipulhstu.movizapp.retrofit.Movie
import com.bipulhstu.movizapp.ui.theme.MovizAppTheme

@Composable
fun MovieItem(movie: Movie){

    Card (elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier.padding(12.dp)
            .fillMaxWidth()
        ) {

        Row (modifier = Modifier.padding(8.dp)){
            AsyncImage(
                model = "https://image.tmdb.org/t/p/w500${movie.poster_path}",
                contentDescription = "Movie Image"
            )


            Spacer(modifier = Modifier.width(8.dp))

            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = movie.title, style = MaterialTheme.typography.labelLarge)
                Text(text = movie.overview, style = MaterialTheme.typography.bodySmall)
            }
        }

    }
}

@Preview
@Composable
fun MovieItemPreview(){
    MovizAppTheme {
        MovieItem(movie = Movie("Inside Out 2", "This is a demo description of a movie", "/d8Ryb8AunYAuycVKDp5HpdWPKgC.jpg"))
    }
}