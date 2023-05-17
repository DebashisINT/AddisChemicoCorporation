package com.breezefsmaddischemicocorporation.features.newcollectionreport

import com.breezefsmaddischemicocorporation.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}