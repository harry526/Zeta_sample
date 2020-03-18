package com.harish.exercise.network

import com.harish.exercise.model.FeedMainResponse
import com.harish.exercise.subscribers.ISubscribe

class DataParser {
    companion object {
        /**
         * Using apiKey to know the which response is specific to which api call
         * Helpfull when we have multiple api call in sigle viewModel/Activity
         * */
        fun ParseToFeedList(response: FeedMainResponse, callBack: ISubscribe, apiKey: Int) {
            response.apiKey = apiKey
            val list: FeedMainResponse = response
            if(list!= null) callBack.onComplete(list)
            else callBack.onCompleteWithError(list)
        }
    }
}