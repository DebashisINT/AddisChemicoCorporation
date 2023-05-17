package com.breezefsmaddischemicocorporation.features.dashboard.presentation.api.dayStartEnd

import com.breezefsmaddischemicocorporation.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefsmaddischemicocorporation.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}