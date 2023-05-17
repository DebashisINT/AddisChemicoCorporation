package com.breezefsmaddischemicocorporation.features.survey.api

import com.breezefsmaddischemicocorporation.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefsmaddischemicocorporation.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}