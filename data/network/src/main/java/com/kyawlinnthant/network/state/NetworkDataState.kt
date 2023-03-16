package com.kyawlinnthant.network.state

sealed interface NetworkDataState<out T> {
    data class Success<out T>(val data: T) : NetworkDataState<T>
    data class Error(val message: String) : NetworkDataState<Nothing>
}