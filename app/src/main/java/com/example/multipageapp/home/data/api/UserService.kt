package com.example.multipageapp.home.data.api

import com.example.multipageapp.network.RetrofitBuilder

class UserService(private val retrofitBuilder: RetrofitBuilder) {

    fun getUserService(): UserApi = retrofitBuilder.retrofit.create(UserApi::class.java)

}