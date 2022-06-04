package com.example.mapapp.viewModel

import PlaceDataModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mapapp.model.MainActivityModel
import com.example.mapapp.network.RequestCompleteListener

class MainViewModel : ViewModel() {

    var placeModelListLiveData = MutableLiveData<PlaceDataModel>()
    var placeFailureLiveData = MutableLiveData<String>()

    fun getPlaceList(longitude: Double,latitude: Double, ptype: String) {
        MainActivityModel.getPlaceList(object : RequestCompleteListener<PlaceDataModel> {
            override fun onSuccess(data: PlaceDataModel) {
                placeModelListLiveData.postValue(data)
            }
            override fun onFailed(message: String) {
                placeFailureLiveData.postValue(message)
            }

        },longitude,latitude,ptype)
    }

}

