package com.harish.exercise.network

import android.util.Log
import com.google.gson.Gson
import com.harish.exercise.common.BaseModel
import com.harish.exercise.model.FeedMainResponse
import com.harish.exercise.subscribers.ISubscribe
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiDataAdapter {

    companion object {

        private val apiKey = "AIzaSyAjTPFgulkdrELcWmo1jAa8wqtHLrztyKc"
        private val cx = "011476162607576381860:ra4vmliv9ti"
        private val url = "https://www.googleapis.com/customsearch/"

        private fun getRetrofitClient(): ApiManager {
            val retrofit = Retrofit.Builder().baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            val manager = retrofit.create(ApiManager::class.java)
            return manager
        }
    }

    fun makeFeedRequest(baseRequestModel: BaseModel, callback: ISubscribe) {
        getRetrofitClient().getFeeds(baseRequestModel.searchString, cx, apiKey).enqueue(object : Callback<FeedMainResponse> {
            override fun onResponse(call: Call<FeedMainResponse>, response: Response<FeedMainResponse>) {
                Log.e("Harry", response.message())
                DataParser.ParseToFeedList(response.body()!!, callback, baseRequestModel.apiKey)
            }
            override fun onFailure(call: Call<FeedMainResponse>, t: Throwable) {
                Log.e("Harrym",t.message!!)
                callback.onError(t.message!!)
            }
        })
    }

}