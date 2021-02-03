package com.salampakistan.ui.fragments.visastatus

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.google.gson.Gson
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.DialogVisaStatusBinding
import com.salampakistan.databinding.FragmentCheckVisaStatusBinding
import com.salampakistan.model.CountryVisaStatus
import com.salampakistan.network.Result
import com.salampakistan.ui.fragments.dialog.ListDialogFragment
import com.salampakistan.utils.FragmentTransitionHelper
import com.salampakistan.utils.RxClicks
import timber.log.Timber
import java.util.concurrent.TimeUnit


/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class CheckVisaStatusFragment : BaseFragment<FragmentCheckVisaStatusBinding>(), Injectable {

    private lateinit var viewModel: CheckVisaStatusViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        val binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)
        getData(binding)
        RxView.clicks(binding.backBtnView.backBtn)
            .subscribe { navController.navigateUp() }
    }

    private fun getData(binding: FragmentCheckVisaStatusBinding) {
        viewModel.statuses.observe(viewLifecycleOwner, Observer {
            Timber.d("Response: %s", Gson().toJson(it.data))
            when (it.status) {
                Result.Status.SUCCESS -> {
                    if (it.data?.statuses != null) {
                        val statuses = it.data.statuses
                        Timber.d("statuses size: %d", statuses.size)
                        if (statuses.isNotEmpty()) {
                            setViews(binding, statuses)
                        }
                    }
                }
                Result.Status.LOADING -> {
                }
                Result.Status.ERROR -> {
                }
            }
        })
    }

    private fun setViews(
        binding: FragmentCheckVisaStatusBinding,
        statuses: List<CountryVisaStatus>
    ) {
        binding.countryText.isEnabled = true
        RxView.clicks(binding.countryText)
            .throttleFirst(RxClicks.THROTTLE_DELAY, TimeUnit.MILLISECONDS)
            .subscribe {
                val names: List<String> = statuses.map { it.name }
                val dialogFg = ListDialogFragment.getInstance(names as ArrayList<String>)
                dialogFg.show(childFragmentManager, "Country")
                dialogFg.itemClickPositionSubject
                    .subscribe { clickedPosition ->
                        run {
                            dialogFg.dismissAllowingStateLoss()
                            updateSelectedCountryText(binding, names[clickedPosition])
                            showStatusDialog(statuses[clickedPosition])
                        }
                    }
            }
    }

    private fun updateSelectedCountryText(
        binding: FragmentCheckVisaStatusBinding,
        country: String
    ) {
        binding.countryText.text = country
    }

    private fun showStatusDialog(visa: CountryVisaStatus) {
        val dialog = Dialog(getBaseActivity())
        val binding = DataBindingUtil.inflate<DialogVisaStatusBinding>(
            LayoutInflater.from(context),
            com.salampakistan.R.layout.dialog_visa_status,
            null,
            false
        )
        binding.country = visa.name
        binding.arrival = visa.onArrival
        binding.online = visa.online

        RxView.clicks(binding.okBtn)
            .subscribe {
                dialog.dismiss()
                Handler().post {
                    val uri = Uri.parse("https://visa.nadra.gov.pk/tourist-visa/")
                    val intent = Intent(Intent.ACTION_VIEW, uri)
                    startActivity(intent)
                }
            }

        dialog.setContentView(binding.root)
        val params = dialog.window!!.attributes
        params.width =
            dialog.context.resources.getDimension(com.salampakistan.R.dimen.dialog_width).toInt()
        dialog.window!!.attributes = params
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
    }

    override fun getViewId() = com.salampakistan.R.layout.fragment_check_visa_status
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<FragmentCheckVisaStatusBinding>(view)!!

    companion object {
        fun getInstance(): CheckVisaStatusFragment {
            val fg = CheckVisaStatusFragment()
            FragmentTransitionHelper.setupTransitionFromEnd(fg)
            return fg
        }
    }
}