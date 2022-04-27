package com.example.demo.common.lce

import androidx.compose.runtime.Composable
import com.example.demo.common.*

/**
 * 通过State进行控制的Loading、Content、Error页面
 *
 * @param appState 数据State
 * @param onErrorClick 错误时的点击事件
 * @param content 数据加载成功时应显示的可组合项
 */
@Composable
fun <T> LcePage(
    appState: AppState<T>,
    onErrorClick: () -> Unit,
    content: @Composable (T) -> Unit
) = when (appState) {
    AppLoading -> {
        LoadingContent()
    }
    is AppError -> {

    }
    is AppNoContent -> {

    }
    is AppSuccess<T> -> {

    }
}