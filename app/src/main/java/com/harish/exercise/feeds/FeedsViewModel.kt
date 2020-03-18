package com.harish.exercise.feeds

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harish.exercise.common.BaseModel
import com.harish.exercise.common.BaseResponseModel
import com.harish.exercise.model.FeedMainResponse
import com.harish.exercise.network.ApiDataAdapter
import com.harish.exercise.subscribers.ISubscribe
import com.harish.exercise.utils.Utils

class FeedsViewModel: ViewModel(), ISubscribe {

    var feedsList: MutableLiveData<FeedMainResponse>? = null
    var dataAdapter: ApiDataAdapter? = null
    var title: ObservableField<String>? = null

    override fun onViewAvailable() {
        dataAdapter = ApiDataAdapter()
        title = ObservableField()
    }

    fun getFeedRequest(searchKey: String) {
        if(feedsList == null){
            feedsList = MutableLiveData()
        }
        dataAdapter?.makeFeedRequest(BaseModel(searchKey, Utils.FEEDS_RESPONSE), this)
    }

    override fun onComplete(response: BaseResponseModel) {
        when(response.apiKey) {
            Utils.FEEDS_RESPONSE -> feedsList?.postValue(response as? FeedMainResponse)
        }
    }

    override fun onCompleteWithError(response: BaseResponseModel) {
        when(response.apiKey) {
            Utils.FEEDS_RESPONSE -> feedsList?.postValue(response as? FeedMainResponse)
        }
    }

    override fun onError(error: String) {

    }

    override fun onCleared() {
        super.onCleared()
    }

}