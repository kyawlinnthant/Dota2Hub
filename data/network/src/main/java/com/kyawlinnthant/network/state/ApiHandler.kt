package com.kyawlinnthant.network.state

import retrofit2.Response

inline fun <reified T> safeApiCall(
    apiCall: () -> Response<T>
): NetworkDataState<T> {
    try {
        val response = apiCall()
        // [200..300]
        if (response.isSuccessful) {
            val body = response.body() ?: return NetworkDataState.Error(
                message = "Something's wrong in server"
            )
            return NetworkDataState.Success(data = body)
        }
        //this will be [400..500]
        return NetworkDataState.Error(
            message = response.message()
        )
    } catch (e: Exception) {
        //this will be Internet, server, etc.
        return NetworkDataState.Error(
            message = e.localizedMessage ?: "Something's Wrong!",
        )
    }
}