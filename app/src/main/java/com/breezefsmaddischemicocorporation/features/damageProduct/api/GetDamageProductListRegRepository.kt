package com.breezefsmaddischemicocorporation.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefsmaddischemicocorporation.app.FileUtils
import com.breezefsmaddischemicocorporation.base.BaseResponse
import com.breezefsmaddischemicocorporation.features.NewQuotation.model.*
import com.breezefsmaddischemicocorporation.features.addshop.model.AddShopRequestData
import com.breezefsmaddischemicocorporation.features.addshop.model.AddShopResponse
import com.breezefsmaddischemicocorporation.features.damageProduct.model.DamageProductResponseModel
import com.breezefsmaddischemicocorporation.features.damageProduct.model.delBreakageReq
import com.breezefsmaddischemicocorporation.features.damageProduct.model.viewAllBreakageReq
import com.breezefsmaddischemicocorporation.features.login.model.userconfig.UserConfigResponseModel
import com.breezefsmaddischemicocorporation.features.myjobs.model.WIPImageSubmit
import com.breezefsmaddischemicocorporation.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}