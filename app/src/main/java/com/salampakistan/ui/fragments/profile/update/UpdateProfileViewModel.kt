package com.salampakistan.ui.fragments.profile.update

import android.app.Application
import com.salampakistan.base.BaseViewModel
import com.salampakistan.network.repos.UsersRepo
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class UpdateProfileViewModel @Inject constructor(
    application: Application
    , private val repo: UsersRepo
) : BaseViewModel(application) {

    fun editProfile(
        id: String,
        token: String,
        firstName: String,
        lastName: String,
        mobile: String,
        nic: String,
        gender: String,
        dob: String
    ) = repo.editProfile(id, token, firstName, lastName, mobile, nic, gender, dob)

    fun uploadProfilePhoto(id:String,token:String,photo:String) = repo.updateProfilePhoto(id, token, photo)
}