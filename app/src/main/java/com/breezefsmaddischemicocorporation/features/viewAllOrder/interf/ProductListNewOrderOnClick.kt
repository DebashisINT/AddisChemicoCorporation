package com.breezefsmaddischemicocorporation.features.viewAllOrder.interf

import com.breezefsmaddischemicocorporation.app.domain.NewOrderGenderEntity
import com.breezefsmaddischemicocorporation.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}