package com.harish.exercise.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Item {

    @SerializedName("kind")
    @Expose
    var kind: String? = null
    @SerializedName("title")
    @Expose
    var title: String? = null
    @SerializedName("htmlTitle")
    @Expose
    var htmlTitle: String? = null
    @SerializedName("link")
    @Expose
    var link: String? = null
    @SerializedName("displayLink")
    @Expose
    var displayLink: String? = null
    @SerializedName("snippet")
    @Expose
    var snippet: String? = null
    @SerializedName("htmlSnippet")
    @Expose
    var htmlSnippet: String? = null
    @SerializedName("cacheId")
    @Expose
    var cacheId: String? = null
    @SerializedName("formattedUrl")
    @Expose
    var formattedUrl: String? = null
    @SerializedName("htmlFormattedUrl")
    @Expose
    var htmlFormattedUrl: String? = null
    @SerializedName("pagemap")
    @Expose
    var pagemap: Pagemap? = null

}
