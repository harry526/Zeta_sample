package com.harish.exercise.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Sitenavigationelement {

    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("url")
    @Expose
    var url: String? = null

}
