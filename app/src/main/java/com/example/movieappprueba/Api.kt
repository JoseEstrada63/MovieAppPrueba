package com.example.movieappprueba

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {


    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "YOUR_API_KEY",
        @Query("language") language: String,
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/now_playing")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "YOUR_API_KEY",
        @Query("language") language: String,
        @Query("page") page: Int

    ): Call<GetMoviesResponse>

    @GET("movie/{movie_id}/videos")
    fun getVideosOf(
        @Path("movie_id") movieId: String,
        @Query("api_key") apiKey: String = "YOUR_API_KEY",
        @Query("language") language: String
    ): Call<GetMoviesResponse>
}
