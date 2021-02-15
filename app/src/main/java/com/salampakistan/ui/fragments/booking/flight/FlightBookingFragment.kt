package com.salampakistan.ui.fragments.booking.flight

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentFlightBookingBinding
import com.salampakistan.model.enums.HotelCheck
import com.salampakistan.model.enums.TripBound
import com.salampakistan.model.enums.TripDirection
import com.salampakistan.model.enums.TripType
import com.salampakistan.model.getairportresponse.AirPort
import com.salampakistan.network.JSONKeys
import com.salampakistan.network.Result
import com.salampakistan.ui.fragments.booking.flight.flightlist.FlightListFragment
import com.salampakistan.ui.fragments.dialog.ListDialogFragment
import com.salampakistan.utils.CalendarUtils
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class FlightBookingFragment : BaseFragment<FragmentFlightBookingBinding>(), Injectable {

    private lateinit var binding: FragmentFlightBookingBinding
    private lateinit var viewModel: FlightBookingViewModel
    lateinit var listOfCabin: ArrayList<String>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        binding.fragment = this
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        super.onViewCreated(view, savedInstanceState)
        setListeners()
        setView()
        if (viewModel.airPorts.isNullOrEmpty()) getAirPorts()
    }

    private fun getAirPorts() {
        viewModel.getAirports().observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            when (it.status) {
                Result.Status.LOADING -> {
                    showProgressBar(true)
                }
                Result.Status.SUCCESS -> {
                    hideProgressBar()
                    if (it.data?.data != null)
                        viewModel.airPorts = it.data.data
                }
                Result.Status.ERROR -> {
                    hideProgressBar()
                }
            }
        })
    }

    private fun setView() {

        viewModel.tripType.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            if(it == TripType.ONE_WAY){
                val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
                layoutParams.marginEnd = 0
                layoutParams.weight = 0.5F
                binding.llDepart.layoutParams = layoutParams
            }
            else{
                val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
                layoutParams.marginEnd = resources.getDimension(R.dimen.padding_small).toInt()
                layoutParams.weight = 0.5F
                binding.llDepart.layoutParams = layoutParams

            }
        })
        binding.adultsCounterLayout.counterValueText.text = getString(R.string.one)

        listOfCabin = ArrayList()
        listOfCabin.add("Economy")
        val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val df = SimpleDateFormat("dd MMM", Locale.getDefault())
        viewModel.serverFormattedDepartureDate.value = sdf.format(System.currentTimeMillis() - 1)
        viewModel.serverFormattedArrivalDate.value = sdf.format(System.currentTimeMillis() - 1)
        viewModel.departingDate.value = df.format(System.currentTimeMillis() - 1)
        viewModel.returningDate.value = df.format(System.currentTimeMillis() - 1)

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

        RxView.clicks(binding.backBtn).subscribe { navController.navigateUp() }
    }


    override fun onPause() {
        super.onPause()
        try {
            hideProgressBar()
        } catch (e: Exception) {
        }
    }

    fun onDoneBtnClicked() {
        try {
            val bundle = Bundle()
            bundle.putString(FlightListFragment.CABIN, viewModel.cabin.value)
            bundle.putString(FlightListFragment.DEPARTCITY, viewModel.fromLocation.value)
            bundle.putString(FlightListFragment.ARRIVALCITY, viewModel.toLocation.value)
            bundle.putString(
                FlightListFragment.DEPARTDATE,
                viewModel.serverFormattedDepartureDate.value
            )
            bundle.putString(
                FlightListFragment.RETURNDATE,
                viewModel.serverFormattedArrivalDate.value
            )
            bundle.putString(FlightListFragment.TRIPTYPE, viewModel.tripType.value?.name)
            bundle.putInt(
                FlightListFragment.NOOFADULTS,
                binding.adultsCounterLayout.counterValueText.text.toString().toInt()
            )
            bundle.putInt(
                FlightListFragment.NOOFCHILD,
                binding.childrenCounterLayout.counterValueText.text.toString().toInt()
            )
            bundle.putInt(
                FlightListFragment.NOOFINFANTS,
                binding.infantsCounterLayout.counterValueText.text.toString().toInt()
            )
            navController.navigate(R.id.action_bookingFlightFragment_to_flightListFragment, bundle)
        } catch (e: Exception) {
        }
    }

    fun onLocationFieldClicked(direction: TripDirection) {
        val locations = viewModel.airPorts.map { it.cityName }
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

    fun onCabinClicked() {
        val cabins = listOfCabin
        val dialogFg = ListDialogFragment.getInstance(cabins as ArrayList<String>)
        dialogFg.show(childFragmentManager, JSONKeys.cabin)
        dialogFg.itemClickPositionSubject
            .subscribe { position ->
                run {
                    dialogFg.dismissAllowingStateLoss()
                    val cabin = cabins[position]
                    viewModel.cabin.value = cabin
                }
            }
    }

    fun onDateFieldClicked(bound: TripBound) {
        val listener = DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
            val formattedDate = CalendarUtils.getHotelSearchFormattedDate(year, month, dayOfMonth)
            val serverFormattedDate =
                CalendarUtils.getFormattedServerDate(year, month + 1, dayOfMonth)
            if (bound == TripBound.DEPARTING) {
                viewModel.serverFormattedDepartureDate.value = serverFormattedDate
                viewModel.departingDate.value = formattedDate
                viewModel.serverFormattedArrivalDate.value =
                    SimpleDateFormat("yyyy-MM-dd").format(CalendarUtils.getMinimumDate(viewModel.serverFormattedDepartureDate.value))
                viewModel.returningDate.value =
                    SimpleDateFormat("dd MMM").format(CalendarUtils.getMinimumDate(viewModel.serverFormattedDepartureDate.value))
            } else {
                viewModel.serverFormattedArrivalDate.value = serverFormattedDate
                viewModel.returningDate.value = formattedDate
            }
        }
        if (bound == TripBound.DEPARTING)
            CalendarUtils.showDatePicker(
                context!!,
                listener,
                minDate = System.currentTimeMillis() - 1
            )
        else CalendarUtils.showDatePicker(
            context!!,
            listener,
            minDate = CalendarUtils.getMinimumDate(viewModel.serverFormattedDepartureDate.value)
        )
    }

    override fun getViewId() = com.salampakistan.R.layout.fragment_flight_booking
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<FragmentFlightBookingBinding>(view)!!

    companion object {
        fun getInstance() = FlightBookingFragment()
    }
}