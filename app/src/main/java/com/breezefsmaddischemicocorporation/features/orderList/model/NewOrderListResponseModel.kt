package com.breezefsmaddischemicocorporation.features.orderList.model

import com.breezefsmaddischemicocorporation.base.BaseResponse

/**
 * Created by Saikat on 03-12-2018.
 */
class NewOrderListResponseModel : BaseResponse() {
    var order_list: ArrayList<NewOrderListDataModel>? = null
}