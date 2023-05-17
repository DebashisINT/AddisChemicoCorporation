package com.breezefsmaddischemicocorporation.features.viewAllOrder.orderOptimized

import com.breezefsmaddischemicocorporation.app.domain.ProductOnlineRateTempEntity
import com.breezefsmaddischemicocorporation.base.BaseResponse
import com.breezefsmaddischemicocorporation.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}