package com.harish.exercise.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Pagemap {

    @SerializedName("cse_thumbnail")
    @Expose
    var cseThumbnail: List<CseThumbnail>? = null
    @SerializedName("metatags")
    @Expose
    var metatags: List<Metatag>? = null
    @SerializedName("cse_image")
    @Expose
    var cseImage: List<CseImage>? = null
    @SerializedName("wpheader")
    @Expose
    var wpheader: List<Wpheader>? = null
    @SerializedName("sitenavigationelement")
    @Expose
    var sitenavigationelement: List<Sitenavigationelement>? = null

}
