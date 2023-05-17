package com.breezefsmaddischemicocorporation.features.weather.api

import com.breezefsmaddischemicocorporation.features.task.api.TaskApi
import com.breezefsmaddischemicocorporation.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}