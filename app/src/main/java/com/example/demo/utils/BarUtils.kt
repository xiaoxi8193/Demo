package com.example.demo.utils

import android.app.Activity
import android.graphics.Color
import android.view.View
import android.view.WindowManager
import androidx.core.view.ViewCompat

/**
 * 设置透明状态栏
 */
fun Activity.transparentStatusBar() {
    window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
    val option = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
    val vis = window.decorView.systemUiVisibility
    window.decorView.systemUiVisibility = option or vis
    window.statusBarColor = Color.TRANSPARENT
}
