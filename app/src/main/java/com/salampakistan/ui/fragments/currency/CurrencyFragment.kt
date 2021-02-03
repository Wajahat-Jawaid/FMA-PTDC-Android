package com.salampakistan.ui.fragments.currency

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.google.gson.Gson
import com.jakewharton.rxbinding.view.RxView
import com.jakewharton.rxbinding.widget.RxTextView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentCurrencyBinding
import com.salampakistan.model.Currency
import com.salampakistan.network.Result
import com.salampakistan.ui.fragments.dialog.ListDialogFragment
import com.salampakistan.utils.RxClicks
import com.salampakistan.utils.extension.getFormattedPrice
import timber.log.Timber
import java.util.concurrent.TimeUnit

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class CurrencyFragment : BaseFragment<FragmentCurrencyBinding>(), Injectable {

    private lateinit var viewModel: CurrencyViewModel
    private lateinit var selectedCurrency: Currency

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        val binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)
        getData(binding)
    }

    private fun getData(binding: FragmentCurrencyBinding) {
        viewModel.currencies.observe(viewLifecycleOwner, Observer {
            Timber.d("Response: %s", Gson().toJson(it.data))
            when (it.status) {
                Result.Status.SUCCESS -> {
                    if (it.data?.currencies != null) {
                        val currencies = it.data.currencies
                        Timber.d("Currencies size: %d", currencies.size)
                        if (currencies.isNotEmpty()) {
                            selectedCurrency = currencies[0]
                            setViews(binding, currencies)
                            updateSelectedCurrencyText(binding)
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

    private fun setViews(binding: FragmentCurrencyBinding, currencies: List<Currency>) {
        binding.currencyAmountText.isEnabled = true
        binding.currencyNameText.isEnabled = true
        RxView.clicks(binding.currencyNameText)
            .throttleFirst(RxClicks.THROTTLE_DELAY, TimeUnit.MILLISECONDS)
            .subscribe {
                val names: List<String> = currencies.map { "${it.name.name} (${it.name.id})" }
                val dialogFg = ListDialogFragment.getInstance(names as ArrayList<String>)
                dialogFg.show(childFragmentManager, "Currency")
                dialogFg.itemClickPositionSubject
                    .subscribe { clickedPosition ->
                        run {
                            dialogFg.dismissAllowingStateLoss()
                            selectedCurrency = currencies[clickedPosition]
                            updateSelectedCurrencyText(binding)
                            calculateCurrency(binding)
                        }
                    }
            }
        RxTextView.textChanges(binding.currencyAmountText)
            .subscribe { text ->
                run {
                    if (text.isNotEmpty())
                        calculateCurrency(binding)
                }
            }
    }

    private fun updateSelectedCurrencyText(binding: FragmentCurrencyBinding) {
        binding.currencyNameText.text = selectedCurrency.name.id
    }

    private fun calculateCurrency(binding: FragmentCurrencyBinding) {
        // To avoid calculations with null or 0
        if (binding.currencyAmountText.text.toString().isEmpty())
            binding.currencyAmountText.setText("1")
        val rates = getCurrencyRate(selectedCurrency)
        val convertedAmount = (binding.currencyAmountText.text.toString().toFloat()) * rates
        binding.rupeesAmountText.text = convertedAmount.getFormattedPrice()
    }

    private fun getCurrencyRate(currency: Currency) = currency.rate

    override fun getViewId() = R.layout.fragment_currency
    override fun injectBinding(view: View) = DataBindingUtil.bind<FragmentCurrencyBinding>(view)!!

    companion object {
        fun getInstance() = CurrencyFragment()
    }
}