package com.salampakistan.ui.fragments.profile

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.salampakistan.ui.fragments.reviews.ReviewsListFragment
import com.salampakistan.ui.fragments.wishlist.WishlistListFragment

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class ProfileFragmentPagerAdapter(manager: FragmentManager) :
    FragmentStatePagerAdapter(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ProfileOptionsFragment.getInstance()
            1 -> ReviewsListFragment.getInstance()
            2 -> WishlistListFragment.getInstance()
            3 -> ContactUsFragment.getInstance()
            else -> AboutUsFragment.getInstance()
        }
    }

    override fun getCount() = 4
}