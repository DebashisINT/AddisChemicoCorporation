package com.breezefsmaddischemicocorporation.features.addshop.api

import com.breezefsmaddischemicocorporation.features.addshop.model.AddShopRequestData
import com.breezefsmaddischemicocorporation.features.addshop.model.AddShopResponse
import io.reactivex.Observable

/**
 * Created by Pratishruti on 22-11-2017.
 */
object AddShopRepositoryProvider {
    fun provideAddShopRepository(): AddShopRepository {
        return AddShopRepository(AddShopApi.create())
    }

    fun provideAddShopWithoutImageRepository(): AddShopRepository {
        return AddShopRepository(AddShopApi.createWithoutMultipart())
    }
    //02-11-2021
    fun provideHandleDuplicatePhoneNumberRepo(): AddShopRepository {
        return AddShopRepository(AddShopApi.createWithoutMultipart())
    }

}