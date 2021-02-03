package com.salampakistan.ui.fragments.profile

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.databinding.FragmentProfileBinding
import com.salampakistan.ui.custom.transformer.ZoomOutPageTransformer

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class ProfileFragment : BaseFragment<FragmentProfileBinding>(), Injectable {

    private var currentViewType = ViewType.OPTIONS
    private lateinit var binding: FragmentProfileBinding

    enum class ViewType {
        OPTIONS,
        WISHLIST,
        REVIEWS,
        CONTACT,
        ABOUT
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = injectBinding(view)
        binding.viewPager.setPageTransformer(true, ZoomOutPageTransformer())
        binding.viewPager.adapter = ProfileFragmentPagerAdapter(childFragmentManager)
        RxView.clicks(binding.backBtn)
            .subscribe {
                changeFragment(ViewType.OPTIONS)
            }
    }

    fun changeFragment(viewType: ViewType) {
        currentViewType = viewType
        if (viewType == ViewType.OPTIONS) {
            binding.toolbarTitle.text = getString(R.string.profile)
            binding.backBtn.visibility = View.GONE
            binding.viewPager.currentItem = 0
        }

        else if (viewType == ViewType.REVIEWS) {
            binding.toolbarTitle.text = getString(R.string.reviews_and_feedback)
            binding.backBtn.visibility = View.VISIBLE
            binding.viewPager.currentItem = 1
        }
        else if (viewType == ViewType.WISHLIST) {
            binding.toolbarTitle.text = getString(R.string.wishlist)
            binding.backBtn.visibility = View.VISIBLE
            binding.viewPager.currentItem = 2
        }
        else if (viewType == ViewType.CONTACT) {
            binding.toolbarTitle.text = getString(R.string.contact_us)
            binding.backBtn.visibility = View.VISIBLE
            binding.viewPager.currentItem = 3
        }
        else if (viewType == ViewType.ABOUT) {
            binding.toolbarTitle.text = getString(R.string.about_us)
            binding.backBtn.visibility = View.VISIBLE
            binding.viewPager.currentItem = 4
        }
    }

    override fun getViewId() = R.layout.fragment_profile
    override fun injectBinding(view: View) = DataBindingUtil.bind<FragmentProfileBinding>(view)!!
    override fun getTitle() = getString(R.string.profile).capitalize()

    companion object {
        fun getInstance() = ProfileFragment()
    }
}