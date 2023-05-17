package com.breezefsmaddischemicocorporation.features.document.api

import com.breezefsmaddischemicocorporation.features.dymanicSection.api.DynamicApi
import com.breezefsmaddischemicocorporation.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}