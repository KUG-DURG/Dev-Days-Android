package com.example.multipageapp.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multipageapp.home.data.UserModel
import com.example.multipageapp.home.data.api.UserService
import com.example.multipageapp.home.data.repository.UserRepository
import com.example.multipageapp.network.RetrofitBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val repository: UserRepository = UserRepository(UserService(RetrofitBuilder))

    private var _userLiveData = MutableLiveData<UserModel>()
    val userLiveData: LiveData<UserModel>
        get() = _userLiveData



    //passsing data b/w fragments
     val passingData=MutableLiveData<String>("")



    fun fetchData(){

          viewModelScope.launch(Dispatchers.IO) {

              val response = repository.getUserData()

              if(response.isSuccessful){

                  _userLiveData.postValue(response.body())
              }

          }
      }


    fun setData(name:String){
        passingData.value = name

    }
}