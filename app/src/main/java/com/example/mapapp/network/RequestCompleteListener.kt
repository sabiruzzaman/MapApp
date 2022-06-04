package com.example.mapapp.network

interface RequestCompleteListener<T> {
    fun onSuccess(data: T)
    fun onFailed(message: String)
}