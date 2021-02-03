package com.salampakistan.base

import android.app.Application
import android.content.Context
import androidx.annotation.StringRes
import androidx.lifecycle.AndroidViewModel

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
abstract class BaseViewModel(application: Application) : AndroidViewModel(application) {

    fun getContext(): Context = getApplication<Application>().applicationContext
    fun getString(@StringRes res: Int): String =
        getApplication<Application>().applicationContext.getString(res)
}