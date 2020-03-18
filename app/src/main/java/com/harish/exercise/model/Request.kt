package com.harish.exercise.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Request {

    @SerializedName("title")
    @Expose
    var title: String? = null
    @SerializedName("totalResults")
    @Expose
    var totalResults: String? = null
    @SerializedName("searchTerms")
    @Expose
    var searchTerms: String? = null
    @SerializedName("count")
    @Expose
    var count: Int? = null
    @SerializedName("startIndex")
    @Expose
    var startIndex: Int? = null
    @SerializedName("inputEncoding")
    @Expose
    var inputEncoding: String? = null
    @SerializedName("outputEncoding")
    @Expose
    var outputEncoding: String? = null
    @SerializedName("safe")
    @Expose
    var safe: String? = null
    @SerializedName("cx")
    @Expose
    var cx: String? = null

}
