package com.harish.exercise.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Wpheader {

    @SerializedName("headline")
    @Expose
    var headline: String? = null

}
