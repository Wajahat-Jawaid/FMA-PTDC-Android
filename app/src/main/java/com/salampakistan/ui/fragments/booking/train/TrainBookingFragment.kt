package com.salampakistan.ui.fragments.booking.train

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentTrainBookingBinding
import com.salampakistan.model.enums.TripDirection
import com.salampakistan.network.JSONKeys
import com.salampakistan.ui.fragments.dialog.ListDialogFragment

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class TrainBookingFragment : BaseFragment<FragmentTrainBookingBinding>(), Injectable {

    private lateinit var viewModel: TrainBookingViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        val binding = injectBinding(view)
        binding.fragment = this
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        super.onViewCreated(view, savedInstanceState)
    }

    fun onDoneBtnClicked() {
        // Generate url now. Confirm with A.Rafay
        launchWebView("https://www.pakrail.gov.pk/")
    }

    fun onLocationFieldClicked(direction: TripDirection) {
        val locations = resources.getStringArray(com.salampakistan.R.array.locations) as ArrayList<String>
        val dialogFg = ListDialogFragment.getInstance(locations)
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

    override fun getViewId() = R.layout.fragment_train_booking
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<FragmentTrainBookingBinding>(view)!!

    companion object {
        fun getInstance() = TrainBookingFragment()
    }
}