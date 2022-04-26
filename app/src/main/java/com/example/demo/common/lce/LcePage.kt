package com.example.demo.common.lce

import androidx.compose.runtime.Composable
import com.example.demo.common.*

@Composable
fun <T> LcePage(
    appState: AppState<T>,
    onErrorClick: () -> Unit,
    content: @Composable (T) -> Unit
) = when (appState) {
    AppLoading -> {

    }
    is AppError -> {

    }
    is AppNoContent -> {

    }
    is AppSuccess<T> -> {

    }
}