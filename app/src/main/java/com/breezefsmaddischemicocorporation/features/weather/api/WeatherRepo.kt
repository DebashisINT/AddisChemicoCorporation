package com.breezefsmaddischemicocorporation.features.weather.api

import com.breezefsmaddischemicocorporation.base.BaseResponse
import com.breezefsmaddischemicocorporation.features.task.api.TaskApi
import com.breezefsmaddischemicocorporation.features.task.model.AddTaskInputModel
import com.breezefsmaddischemicocorporation.features.weather.model.ForeCastAPIResponse
import com.breezefsmaddischemicocorporation.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}