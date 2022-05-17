package com.example.demo.ui.view.login.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.demo.room.MyAppDatabase
import com.example.demo.room.entity.User
import com.example.demo.util.checkCoroutines
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    application: Application,
    private val loginRepository: LoginRepository
) : AndroidViewModel(application){
    private var userLoginJob: Job? = null

    /**
     * 用户登录
     */
    fun userLogin(user: User){
        userLoginJob.checkCoroutines()
        userLoginJob = viewModelScope.launch{
            loginRepository.userLogin(user)
        }
    }
}