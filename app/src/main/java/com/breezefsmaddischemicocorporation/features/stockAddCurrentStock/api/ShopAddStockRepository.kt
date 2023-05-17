package com.breezefsmaddischemicocorporation.features.stockAddCurrentStock.api

import com.breezefsmaddischemicocorporation.base.BaseResponse
import com.breezefsmaddischemicocorporation.features.location.model.ShopRevisitStatusRequest
import com.breezefsmaddischemicocorporation.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefsmaddischemicocorporation.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefsmaddischemicocorporation.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefsmaddischemicocorporation.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}