package com.harish.exercise.utils

import android.content.Context
import android.widget.Toast

class Utils {
    companion object {
        val FEEDS_RESPONSE: Int = 1

        fun showToast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        }
    }
}