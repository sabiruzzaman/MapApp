package com.example.mapapp.network


import PlaceDataModel
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("search/nearby/category/MzQzOTpZMlUzU1NZREJK/1/10")
    fun getPlaceList(
        @Query("longitude") longitude: Double?,
        @Query("latitude") latitude: Double?,
        @Query("ptype") sorting: String?,
    ): Call<PlaceDataModel>

}