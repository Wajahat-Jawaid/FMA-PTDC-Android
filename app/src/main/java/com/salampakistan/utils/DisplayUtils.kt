package com.salampakistan.utils

import android.app.Activity
import android.util.DisplayMetrics

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
object DisplayUtils {

    fun getScreenWidth(activity: Activity) = getDisplayMetrics(activity).widthPixels
    fun getScreenHeight(activity: Activity) = getDisplayMetrics(activity).heightPixels

    private fun getDisplayMetrics(activity: Activity): DisplayMetrics {
        val displayMetrics = DisplayMetrics()
        activity.windowManager.defaultDisplay.getMetrics(displayMetrics)

        return displayMetrics
    }
}