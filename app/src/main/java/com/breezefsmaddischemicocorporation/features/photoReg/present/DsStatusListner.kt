package com.breezefsmaddischemicocorporation.features.photoReg.present

import com.breezefsmaddischemicocorporation.app.domain.ProspectEntity
import com.breezefsmaddischemicocorporation.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}