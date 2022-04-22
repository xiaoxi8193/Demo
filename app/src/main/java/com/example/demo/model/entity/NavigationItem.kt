package com.example.demo.model.entity

import androidx.compose.ui.graphics.vector.ImageVector

/**
 * 底部导航栏
 */
data class NavigationItem(
    //导航栏的标题
    val title: String,
    //导航栏的图标
    val icon: ImageVector
)
