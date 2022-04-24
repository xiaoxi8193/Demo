package com.example.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.demo.utils.transparentStatusBar


abstract class BaseActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    /**
     * 初始化VIew
     */
    private fun initView() {
        // 加载动画
        installSplashScreen()
        // 状态栏透明
        transparentStatusBar()
    }
}