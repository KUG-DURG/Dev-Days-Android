package com.example.multipageapp.home.data.api

import com.example.multipageapp.home.data.UserModel
import retrofit2.Response
import retrofit2.http.GET

interface UserApi {

    @GET("users")
    suspend fun getUserData():Response<UserModel>

}