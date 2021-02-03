package com.salampakistan.ui.fragments.profile.updatepassword

import android.app.Application
import androidx.lifecycle.ViewModel
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.UsersRepo
import javax.inject.Inject

class UpdatePasswordViewModel @Inject constructor(
    application: Application
    , private val repo: UsersRepo
) : BaseViewModel(application){

    fun updatePassword(id:String,token:String,oldPassword:String,newPassword:String) =
        run { repo.UpdatePassword(id,token,oldPassword,newPassword) }
}