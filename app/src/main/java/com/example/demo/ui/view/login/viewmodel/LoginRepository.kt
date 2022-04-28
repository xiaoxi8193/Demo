package com.example.demo.ui.view.login.viewmodel

import android.app.Application
import com.example.demo.room.MyAppDatabase
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class LoginRepository @Inject constructor(private val context: Application) {
    private val userDao = MyAppDatabase.getDatabase(context = context).userDao()


}