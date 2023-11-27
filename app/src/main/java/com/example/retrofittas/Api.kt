package com.example.retrofittas

import com.example.retrofittas.data.Photo
import com.example.retrofittas.data.User
import retrofit2.http.GET
import retrofit2.http.Path


interface Api {

    @GET("users/1")
    suspend fun getAUser() : User

    @GET("users")
    suspend fun getAllUsers() : List<User>

    @GET("photos/{id}")
    suspend fun getPhotoById(@Path("id") id: Int): Photo
}