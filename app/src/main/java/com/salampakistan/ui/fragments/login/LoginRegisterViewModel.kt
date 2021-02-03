package com.salampakistan.ui.fragments.login

import android.app.Application
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.UsersRepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class LoginRegisterViewModel @Inject constructor(
    application: Application,
    private val repo: UsersRepo
) : BaseViewModel(application) {

    fun login(params: Array<String>) = repo.login(params)
    fun register(params: Array<String>) = repo.register(params)
}