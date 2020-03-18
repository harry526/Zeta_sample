package com.harish.exercise.subscribers

import com.harish.exercise.common.BaseModel
import com.harish.exercise.common.BaseResponseModel

interface ISubscribe {
    fun onComplete(response: BaseResponseModel)
    fun onCompleteWithError(response: BaseResponseModel)
    fun onError(error: String)
    fun onViewAvailable()
}