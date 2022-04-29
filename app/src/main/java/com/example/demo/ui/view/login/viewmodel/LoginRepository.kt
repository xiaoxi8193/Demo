package com.example.demo.ui.view.login.viewmodel

import android.app.Application
import com.example.demo.room.MyAppDatabase
import com.example.demo.room.entity.User
import com.example.demo.util.showToast
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

//定义Repository作用域
@ViewModelScoped
class LoginRepository @Inject constructor(private val context: Application) {
    private val userDao = MyAppDatabase.getDatabase(context = context).userDao()

    suspend fun userLogin(user: User){
        val user1 = userDao.getUser(user.username)
        if (user1 == null){
            showToast(context,"无此用户")
        } else{
            if (user1.password == user.password) {
                showToast(context,"success")
            }
        }

    }
}