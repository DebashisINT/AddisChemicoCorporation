package com.breezefsmaddischemicocorporation.features.viewAllOrder.interf

import com.breezefsmaddischemicocorporation.app.domain.NewOrderGenderEntity
import com.breezefsmaddischemicocorporation.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}