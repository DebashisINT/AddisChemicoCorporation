package com.breezefsmaddischemicocorporation.features.viewAllOrder.interf

import com.breezefsmaddischemicocorporation.app.domain.NewOrderProductEntity
import com.breezefsmaddischemicocorporation.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}