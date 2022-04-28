package com.example.demo.ui.view.login.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.demo.room.MyAppDatabase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    application: Application,
    private val loginRepository: LoginRepository
) : AndroidViewModel(application){

}