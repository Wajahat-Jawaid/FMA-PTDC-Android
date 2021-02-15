package com.salampakistan.ui.fragments.login

import android.content.Context
import com.google.gson.Gson
import com.salampakistan.model.User
import com.salampakistan.model.response.user.LoginResponse
import com.salampakistan.utils.Preferences
import rx.subjects.PublishSubject
import timber.log.Timber

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
object ResponseHandler {

    fun handleSuccessResponse(
        context: Context,
        response: LoginResponse,
        password: String
    ): Boolean {
        val publishSubject = PublishSubject.create<Void>()
        val user = response.data?.profile ?: return false
        val prefs = Preferences(context)
        val user1 = User(
            response.data.id!!,
            response.data.token!!,
            user.firstName,
            user.middleName,
            user.lastName,
            response.data.email!!,
            password,
            user.mobile,
            user.cnic,
            user.gender,
            user.dob,
            ""
        )
        Timber.d("user1: %s", Gson().toJson(user1))
        prefs.saveUser(user1)

        return true
    }
}