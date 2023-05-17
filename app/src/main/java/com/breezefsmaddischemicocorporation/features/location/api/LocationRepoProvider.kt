package com.breezefsmaddischemicocorporation.features.location.api

import com.breezefsmaddischemicocorporation.features.location.shopdurationapi.ShopDurationApi
import com.breezefsmaddischemicocorporation.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}