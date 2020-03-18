package com.harish.exercise.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Metatag {

    @SerializedName("og:image")
    @Expose
    var ogImage: String? = null
    @SerializedName("apple-itunes-app")
    @Expose
    var appleItunesApp: String? = null
    @SerializedName("article:section")
    @Expose
    var articleSection: String? = null
    @SerializedName("og:type")
    @Expose
    var ogType: String? = null
    @SerializedName("twitter:card")
    @Expose
    var twitterCard: String? = null
    @SerializedName("twitter:title")
    @Expose
    var twitterTitle: String? = null
    @SerializedName("og:site_name")
    @Expose
    var ogSiteName: String? = null
    @SerializedName("author")
    @Expose
    var author: String? = null
    @SerializedName("article:section_url")
    @Expose
    var articleSectionUrl: String? = null
    @SerializedName("og:title")
    @Expose
    var ogTitle: String? = null
    @SerializedName("article:id")
    @Expose
    var articleId: String? = null
    @SerializedName("og:updated_time")
    @Expose
    var ogUpdatedTime: String? = null
    @SerializedName("og:description")
    @Expose
    var ogDescription: String? = null
    @SerializedName("twitter:creator")
    @Expose
    var twitterCreator: String? = null
    @SerializedName("article:publisher")
    @Expose
    var articlePublisher: String? = null
    @SerializedName("twitter:image")
    @Expose
    var twitterImage: String? = null
    @SerializedName("referrer")
    @Expose
    var referrer: String? = null
    @SerializedName("fb:app_id")
    @Expose
    var fbAppId: String? = null
    @SerializedName("twitter:site")
    @Expose
    var twitterSite: String? = null
    @SerializedName("viewport")
    @Expose
    var viewport: String? = null
    @SerializedName("twitter:description")
    @Expose
    var twitterDescription: String? = null
    @SerializedName("article:published")
    @Expose
    var articlePublished: String? = null
    @SerializedName("og:url")
    @Expose
    var ogUrl: String? = null
    @SerializedName("article:modified")
    @Expose
    var articleModified: String? = null
    @SerializedName("theme-color")
    @Expose
    var themeColor: String? = null
    @SerializedName("google")
    @Expose
    var google: String? = null
    @SerializedName("og:image:width")
    @Expose
    var ogImageWidth: String? = null
    @SerializedName("article:published_time")
    @Expose
    var articlePublishedTime: String? = null
    @SerializedName("og:image:height")
    @Expose
    var ogImageHeight: String? = null
    @SerializedName("og:locale")
    @Expose
    var ogLocale: String? = null

}
