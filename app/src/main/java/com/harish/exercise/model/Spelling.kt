package com.harish.exercise.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Spelling {

    @SerializedName("correctedQuery")
    @Expose
    var correctedQuery: String? = null
    @SerializedName("htmlCorrectedQuery")
    @Expose
    var htmlCorrectedQuery: String? = null

}
