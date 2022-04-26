package com.example.demo.common

/**
 * 根据State的值判断APP的状态
 */
sealed class AppState<out R> {
    fun isLoading() = this is AppLoading
    fun isSuccessful() = this is AppSuccess

    override fun toString(): String {
        return when (this) {
            is AppSuccess<*> -> "Success[data=$data]"
            is AppNoContent -> "Success[reason=$reason]"
            is AppError -> "Error[exception=${error}]"
            AppLoading -> "Loading"
        }
    }
}

data class AppSuccess<out T>(val data: T) : AppState<T>()
data class AppNoContent(val reason: String) : AppState<Nothing>()
data class AppError(val error: Throwable) : AppState<Nothing>()
object AppLoading : AppState<Nothing>()