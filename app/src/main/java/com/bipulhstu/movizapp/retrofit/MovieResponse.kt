package com.bipulhstu.movizapp.retrofit

data class MovieResponse(
    val pages: Int,
    var results : List<Movie>,
    val total_pages: Int,
    val total_results: Int
)
