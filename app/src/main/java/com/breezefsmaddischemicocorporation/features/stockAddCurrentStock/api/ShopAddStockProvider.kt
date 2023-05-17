package com.breezefsmaddischemicocorporation.features.stockAddCurrentStock.api

import com.breezefsmaddischemicocorporation.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefsmaddischemicocorporation.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}