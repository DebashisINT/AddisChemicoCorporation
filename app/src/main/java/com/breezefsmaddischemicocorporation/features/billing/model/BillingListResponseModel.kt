package com.breezefsmaddischemicocorporation.features.billing.model

import com.breezefsmaddischemicocorporation.base.BaseResponse

/**
 * Created by Saikat on 20-02-2019.
 */
class BillingListResponseModel : BaseResponse() {
    var billing_list: ArrayList<BillingListDataModel>? = null
}