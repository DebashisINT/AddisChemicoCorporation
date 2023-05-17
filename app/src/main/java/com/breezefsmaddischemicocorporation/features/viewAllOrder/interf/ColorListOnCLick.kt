package com.breezefsmaddischemicocorporation.features.viewAllOrder.interf

import com.breezefsmaddischemicocorporation.app.domain.NewOrderGenderEntity
import com.breezefsmaddischemicocorporation.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}