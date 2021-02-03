package com.salampakistan.ui.fragments.booking.flight

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentFlightBookingBinding
import com.salampakistan.model.enums.TripBound
import com.salampakistan.model.enums.TripDirection
import com.salampakistan.network.JSONKeys
import com.salampakistan.ui.fragments.dialog.ListDialogFragment
import com.salampakistan.utils.CalendarUtils
import java.lang.Exception

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class FlightBookingFragment : BaseFragment<FragmentFlightBookingBinding>(), Injectable {

    private lateinit var binding: FragmentFlightBookingBinding
    private lateinit var viewModel: FlightBookingViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        binding.fragment = this
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        super.onViewCreated(view, savedInstanceState)
        setListeners()
        setView()
    }

    private fun setView() {
        binding.adultsCounterLayout.counterValueText.text = getString(R.string.one)
    }

    private fun getAdultsCount(): Int {
        return try {
            Integer.parseInt(
                binding.adultsCounterLayout.counterValueText.text.toString().trim { it <= ' ' })
        } catch (e: NumberFormatException) {
            0
        }
    }

    private fun getChildrenCount(): Int {
        return try {
            Integer.parseInt(
                binding.childrenCounterLayout.counterValueText.text.toString().trim { it <= ' ' })
        } catch (e: NumberFormatException) {
            0
        }
    }

    private fun getInfantsCount(): Int {
        return try {
            Integer.parseInt(
                binding.infantsCounterLayout.counterValueText.text.toString().trim { it <= ' ' })
        } catch (e: NumberFormatException) {
            0
        }
    }

    private fun setListeners() {
        // Adults
        throttleListener(binding.adultsCounterLayout.increaseCounterBtn).subscribe {
            var count = getAdultsCount()
            binding.adultsCounterLayout.counterValueText.text = (++count).toString()
        }
        throttleListener(binding.adultsCounterLayout.decreaseCounterBtn).subscribe {
            var count = getAdultsCount()
            if (count > 1)
                binding.adultsCounterLayout.counterValueText.text = (--count).toString()
        }
        // Children
        throttleListener(binding.childrenCounterLayout.increaseCounterBtn).subscribe {
            var count = getChildrenCount()
            binding.childrenCounterLayout.counterValueText.text = (++count).toString()
        }
        throttleListener(binding.childrenCounterLayout.decreaseCounterBtn).subscribe {
            var count = getChildrenCount()
            if (count > 0)
                binding.childrenCounterLayout.counterValueText.text = (--count).toString()
        }
        // Infants
        throttleListener(binding.infantsCounterLayout.increaseCounterBtn).subscribe {
            var count = getInfantsCount()
            binding.infantsCounterLayout.counterValueText.text = (++count).toString()
        }
        throttleListener(binding.infantsCounterLayout.decreaseCounterBtn).subscribe {
            var count = getInfantsCount()
            if (count > 0)
                binding.infantsCounterLayout.counterValueText.text = (--count).toString()
        }

        RxView.clicks(binding.backBtn).subscribe{navController.navigateUp()}
    }

    fun onDoneBtnClicked() {
        try {
            navController.navigate(R.id.action_bookingFlightFragment_to_flightListFragment)
        } catch (e: Exception) {
        }
    }

    fun onLocationFieldClicked(direction: TripDirection) {
        val locations = resources.getStringArray(com.salampakistan.R.array.locations).toList()
        val dialogFg = ListDialogFragment.getInstance(locations as ArrayList<String>)
        dialogFg.show(childFragmentManager, JSONKeys.locations)
        dialogFg.itemClickPositionSubject
            .subscribe { position ->
                run {
                    dialogFg.dismissAllowingStateLoss()
                    val location = locations[position]
                    if (direction == TripDirection.FROM) {
                        viewModel.fromLocation.value = location
                    } else {
                        viewModel.toLocation.value = location
                    }
                }
            }
    }

    fun onDateFieldClicked(bound: TripBound) {
        val listener = DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
            val formattedDate = CalendarUtils.getHotelSearchFormattedDate(year, month, dayOfMonth)
            if (bound == TripBound.DEPARTING) {
                viewModel.departingDate.value = formattedDate
            } else {
                viewModel.returningDate.value = formattedDate
            }
        }
        CalendarUtils.showDatePicker(context!!, listener, minDate = System.currentTimeMillis() - 1)
    }

    override fun getViewId() = com.salampakistan.R.layout.fragment_flight_booking
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<FragmentFlightBookingBinding>(view)!!

    companion object {
        fun getInstance() = FlightBookingFragment()
    }
}