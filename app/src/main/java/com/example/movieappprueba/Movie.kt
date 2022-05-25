package com.example.movieappprueba

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("id") val id: Long,
    @SerializedName("title") val title: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("poster_path") val posterPath: String,
    @SerializedName("backdrop_path") val backdropPath: String,
    @SerializedName("vote_average") val rating: Float,
    @SerializedName("release_date") val releaseDate: String,
    @SerializedName("iso_639_1")val iso6391: String,
    @SerializedName("iso_3166_1")val iso31661: String,
    @SerializedName("key")val key: String,
    @SerializedName("name")val name: String,
    @SerializedName("site")val site: String,
    @SerializedName("size")val size: Int,
    @SerializedName("type")val type: String
)