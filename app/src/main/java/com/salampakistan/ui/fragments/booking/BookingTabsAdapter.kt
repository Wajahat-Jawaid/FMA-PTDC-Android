package com.salampakistan.ui.fragments.booking

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.salampakistan.base.BaseFragment
import com.salampakistan.ui.fragments.booking.flight.FlightBookingFragment
import com.salampakistan.ui.fragments.booking.hotel.hotelsearch.HotelBookingFragment
import com.salampakistan.ui.fragments.booking.train.TrainBookingFragment

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class BookingTabsAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    private val fragments: List<BaseFragment<*>> = listOf(
        HotelBookingFragment.getInstance(),
        FlightBookingFragment.getInstance(),
        TrainBookingFragment.getInstance()
    )

    override fun getItemCount() = 3
    override fun createFragment(position: Int): BaseFragment<*> {
        return fragments[position]
    }
}