package com.example.wetgerapp.adapters

data class WeatherModel(
    val city: String,
    val time: String,
    val condition: String,
    val currentTemp: String,
    val maxTemp: String,
    val munTemp: String,
    val imageUrl: String,
    val hours: String,
    val windDir: String,
    val windKph: String,
    val humidity: String,
    )
