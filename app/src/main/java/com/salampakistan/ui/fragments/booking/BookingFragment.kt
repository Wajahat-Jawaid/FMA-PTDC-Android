package com.salampakistan.ui.fragments.booking

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.google.android.material.tabs.TabLayoutMediator
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.MainActivity
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.databinding.FragmentBookingBinding
import com.salampakistan.model.enums.BookingEntity
import com.salampakistan.utils.Constants
import com.salampakistan.utils.FragmentTransitionHelper

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class BookingFragment : BaseFragment<FragmentBookingBinding>(), Injectable {

    private lateinit var intendedBookingType: BookingEntity

    override fun handleArguments(arguments: Bundle) {
        intendedBookingType = arguments.getSerializable(Constants.BOOKINGTYPE) as BookingEntity
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)
        RxView.clicks(binding.backBtnView.root).subscribe { navController.navigateUp() }
        binding.viewPager.adapter = BookingTabsAdapter(this)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = getString(
                when (position) {
                    0 -> R.string.hotels
                    1 -> R.string.flights
                    else -> R.string.trains
                }
            )
        }.attach()
        binding.viewPager.postDelayed({
            binding.viewPager.currentItem = when (intendedBookingType) {
                BookingEntity.HOTEL -> 0
                BookingEntity.FLIGHT -> 1
                else -> 2
            }
        }, 100)
    }

    override fun getViewId() = R.layout.fragment_booking
    override fun injectBinding(view: View) = DataBindingUtil.bind<FragmentBookingBinding>(view)!!

    companion object {

        private val TAG = BookingFragment::class.java.simpleName
        private val INTENDED_BOOKING_TYPE = "$TAG.entity"

        fun getInstance(type: BookingEntity): BookingFragment {
            val fg = BookingFragment()
            FragmentTransitionHelper.setupTransitionFromEnd(fg)
            val bundle = Bundle()
            bundle.putSerializable(INTENDED_BOOKING_TYPE, type)
            fg.arguments = bundle
            return fg
        }
    }
}