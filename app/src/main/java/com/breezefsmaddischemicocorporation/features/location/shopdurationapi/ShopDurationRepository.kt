package com.breezefsmaddischemicocorporation.features.location.shopdurationapi

import com.breezefsmaddischemicocorporation.app.Pref
import com.breezefsmaddischemicocorporation.app.utils.AppUtils
import com.breezefsmaddischemicocorporation.base.BaseResponse
import com.breezefsmaddischemicocorporation.features.location.model.MeetingDurationInputParams
import com.breezefsmaddischemicocorporation.features.location.model.ShopDurationRequest
import com.breezefsmaddischemicocorporation.features.location.model.VisitRemarksResponseModel
import io.reactivex.Observable
import timber.log.Timber

/**
 * Created by Pratishruti on 29-11-2017.
 */
class ShopDurationRepository(val apiService: ShopDurationApi) {
    fun shopDuration(shopDuration: ShopDurationRequest?): Observable<ShopDurationRequest> {
        Timber.d("ShopDurationRepository shop_visit_api_call"+AppUtils.getCurrentDateTime().toString()+"\ndata - "+shopDuration.toString())
        return apiService.submitShopDuration(shopDuration)
    }

    fun meetingDuration(meetingDuration: MeetingDurationInputParams?): Observable<BaseResponse> {
        return apiService.submitMeetingDuration(meetingDuration)
    }

    fun getRemarksList(): Observable<VisitRemarksResponseModel> {
        return apiService.getRemarksList(Pref.session_token!!, Pref.user_id!!)
    }
}