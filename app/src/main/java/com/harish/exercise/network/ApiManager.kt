package com.harish.exercise.network

import com.harish.exercise.model.FeedMainResponse
import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiManager {

    @POST("v1?")
    fun getFeeds(@Query("q") searchTerms: String,
                 @Query("cx") cx: String,
                 @Query("key") apiKey: String): Call<FeedMainResponse>

}