package com.harish.exercise.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.harish.exercise.common.BaseModel
import com.harish.exercise.common.BaseResponseModel

class FeedMainResponse: BaseResponseModel() {

    @SerializedName("kind")
    @Expose
    var kind: String? = null
    @SerializedName("url")
    @Expose
    var url: Url? = null
    @SerializedName("queries")
    @Expose
    var queries: Queries? = null
    @SerializedName("context")
    @Expose
    var context: Context? = null
    @SerializedName("searchInformation")
    @Expose
    var searchInformation: SearchInformation? = null
    @SerializedName("spelling")
    @Expose
    var spelling: Spelling? = null
    @SerializedName("items")
    @Expose
    var items: List<Item>? = null

}
