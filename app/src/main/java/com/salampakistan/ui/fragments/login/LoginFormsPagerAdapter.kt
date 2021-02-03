package com.salampakistan.ui.fragments.login

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class LoginFormsPagerAdapter(manager: FragmentManager) :
    FragmentPagerAdapter(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val fragments =
        listOf(LoginFragment.getInstance(), RegisterFragment.getInstance())

    override fun getItem(position: Int): Fragment =
        if (position == 0) fragments[0] as Fragment else fragments[1] as Fragment

    override fun getCount() = 2
}