package com.breezefsmaddischemicocorporation.features.lead.api

import com.breezefsmaddischemicocorporation.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefsmaddischemicocorporation.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}