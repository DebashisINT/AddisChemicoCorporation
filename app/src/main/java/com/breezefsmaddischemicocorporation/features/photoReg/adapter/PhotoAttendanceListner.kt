package com.breezefsmaddischemicocorporation.features.photoReg.adapter

import com.breezefsmaddischemicocorporation.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}