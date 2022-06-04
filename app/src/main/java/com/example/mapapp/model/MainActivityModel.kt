package com.example.mapapp.model

import PlaceDataModel
import com.example.mapapp.network.ApiClient
import com.example.mapapp.network.ApiInterface
import com.example.mapapp.network.RequestCompleteListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivityModel {

    companion object {
        private val apiInterface: ApiInterface =
            ApiClient().getClient.create(ApiInterface::class.java)

        fun getPlaceList(
            callback: RequestCompleteListener<PlaceDataModel>,
            longitude: Double, latitude: Double, ptype: String,

            ) {


            val call: Call<PlaceDataModel> = apiInterface.getPlaceList(longitude, latitude, ptype)
            call.enqueue(object : Callback<PlaceDataModel> {
                override fun onResponse(
                    call: Call<PlaceDataModel>,
                    response: Response<PlaceDataModel>
                ) {
                    if (response.code() == 200) {
                        response.body()?.let { callback.onSuccess(it) }
                    } else {
                        callback.onFailed(response.message())
                    }
                }

                override fun onFailure(call: Call<PlaceDataModel>, t: Throwable) {
                    callback.onFailed(t.message.toString())
                }

            })


        }

    }
}