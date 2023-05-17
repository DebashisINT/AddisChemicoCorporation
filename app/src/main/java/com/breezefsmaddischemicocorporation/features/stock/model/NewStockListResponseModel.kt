package com.breezefsmaddischemicocorporation.features.stock.model

import com.breezefsmaddischemicocorporation.base.BaseResponse


/**
 * Created by Saikat on 17-09-2019.
 */
class NewStockListResponseModel : BaseResponse() {
    var stock_list: ArrayList<StockListDataModel>? = null
}