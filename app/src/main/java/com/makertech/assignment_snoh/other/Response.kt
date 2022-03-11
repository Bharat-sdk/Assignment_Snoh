package com.makertech.assignment_snoh.other

sealed class Response<T> {
    class Loading<T>: Response<T>()

    data class Success< T>(
        val data: T
    ): Response<T>()

    data class Error<T>(
        val errorMessage: String
    ): Response<T>()

    companion object{
        fun <T> loading() = Loading<T>()
        fun <T> success( data: T) = Success(data)
        fun <T> error(errorMessage: String) = Error<T>(errorMessage)
    }
}