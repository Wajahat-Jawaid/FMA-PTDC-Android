package com.salampakistan.ui.fragments.forgotpassword

import android.app.Application
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.UsersRepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class ForgotPasswordViewModel @Inject constructor(
    application: Application,
    private val repo: UsersRepo
) : BaseViewModel(application) {

    fun sendRecoveryEmail(email: String) = repo.forgotPassword(email)
}