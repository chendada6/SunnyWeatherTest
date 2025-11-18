package com.example.sunnyweathertest.logic.network

import com.example.sunnyweathertest.SunnyWeatherApplication
import com.example.sunnyweathertest.logic.model.DailyResponse
import com.example.sunnyweathertest.logic.model.RealtimeResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.Call

interface WeatherService {

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            Call<RealtimeResponse>

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            Call<DailyResponse>
}