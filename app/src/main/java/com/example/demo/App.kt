package com.example.demo

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//使用Hilt第一步，添加注解
@HiltAndroidApp
class App : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}