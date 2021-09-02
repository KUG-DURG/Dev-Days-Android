package com.example.multipageapp.home.data.repository

import com.example.multipageapp.home.data.api.UserService

class UserRepository(private val userService: UserService) {


    suspend fun getUserData()= userService.getUserService().getUserData()

}