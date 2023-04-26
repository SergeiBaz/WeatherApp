package com.example.wetgerapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.wetgerapp.adapters.WeatherModel

class MainViewModel: ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}