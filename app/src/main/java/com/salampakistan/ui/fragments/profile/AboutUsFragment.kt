package com.salampakistan.ui.fragments.profile

import android.view.View
import androidx.databinding.DataBindingUtil
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.databinding.FragmentAboutBinding

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class AboutUsFragment : BaseFragment<FragmentAboutBinding>(), Injectable {
    override fun getViewId() = R.layout.fragment_about
    override fun injectBinding(view: View) = DataBindingUtil.bind<FragmentAboutBinding>(view)!!

    override fun onResume() {
        super.onResume()
        view!!.isFocusableInTouchMode = true
        view!!.requestFocus()
        view!!.setOnKeyListener { _, _, _ ->
            ((parentFragment as ProfileFragment).changeFragment(ProfileFragment.ViewType.OPTIONS))
            true
        }
    }

    companion object {
        fun getInstance() = AboutUsFragment()
    }
}