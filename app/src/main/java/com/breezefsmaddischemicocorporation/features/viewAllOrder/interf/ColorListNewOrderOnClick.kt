package com.breezefsmaddischemicocorporation.features.viewAllOrder.interf

import com.breezefsmaddischemicocorporation.app.domain.NewOrderColorEntity
import com.breezefsmaddischemicocorporation.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}