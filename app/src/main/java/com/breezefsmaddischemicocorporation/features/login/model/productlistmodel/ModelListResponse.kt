package com.breezefsmaddischemicocorporation.features.login.model.productlistmodel

import com.breezefsmaddischemicocorporation.app.domain.ModelEntity
import com.breezefsmaddischemicocorporation.app.domain.ProductListEntity
import com.breezefsmaddischemicocorporation.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}