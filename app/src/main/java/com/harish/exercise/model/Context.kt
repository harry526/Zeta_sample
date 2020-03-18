package com.harish.exercise.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Context {

    @SerializedName("title")
    @Expose
    var title: String? = null

}
