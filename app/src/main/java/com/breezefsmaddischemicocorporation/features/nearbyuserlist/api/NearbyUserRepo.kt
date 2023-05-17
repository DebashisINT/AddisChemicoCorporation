package com.breezefsmaddischemicocorporation.features.nearbyuserlist.api

import com.breezefsmaddischemicocorporation.app.Pref
import com.breezefsmaddischemicocorporation.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefsmaddischemicocorporation.features.newcollection.model.NewCollectionListResponseModel
import com.breezefsmaddischemicocorporation.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}