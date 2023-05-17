package com.breezefsmaddischemicocorporation.features.viewAllOrder.model

import com.breezefsmaddischemicocorporation.app.domain.NewOrderColorEntity
import com.breezefsmaddischemicocorporation.app.domain.NewOrderGenderEntity
import com.breezefsmaddischemicocorporation.app.domain.NewOrderProductEntity
import com.breezefsmaddischemicocorporation.app.domain.NewOrderSizeEntity
import com.breezefsmaddischemicocorporation.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

