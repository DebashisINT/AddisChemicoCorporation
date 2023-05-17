package com.breezefsmaddischemicocorporation.features.location.shopRevisitStatus

import com.breezefsmaddischemicocorporation.features.location.shopdurationapi.ShopDurationApi
import com.breezefsmaddischemicocorporation.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}