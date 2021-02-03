package com.salampakistan.ui.fragments.weather

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.google.gson.Gson
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentWeatherBinding
import com.salampakistan.network.Result
import com.salampakistan.ui.fragments.dialog.ListDialogFragment
import com.salampakistan.utils.RxClicks
import timber.log.Timber
import java.util.concurrent.TimeUnit

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class WeatherFragment : BaseFragment<FragmentWeatherBinding>(), Injectable {

    private lateinit var viewModel: WeatherViewModel
    private val cities = listOf(
        "islamabad", "bahawalpur", "dera ghazi khan", "faisalabad", "gujranwala",
        "lahore", "multan", "rawalpindi", "sahiwal", "sarghoda",
        "kalat", "markan", "naseerabad", "quetta", "sibi",
        "zhob", "rakhshan", "bannu", "dera ismail khan", "hazara",
        "kohat", "malakand", "mardan", "peshawar", "hyderabad",
        "karachi", "sukkur", "larkana", "mirpur khas", "gilgit",
        "mirpur", "muzaffarabad", "poonch"
    ).toList()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        val binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)
        getTemperature(binding, "Islamabad")
        setViews(binding)
    }

    private fun setViews(binding: FragmentWeatherBinding) {
        RxView.clicks(binding.cityText)
            .throttleFirst(RxClicks.THROTTLE_DELAY, TimeUnit.MILLISECONDS)
            .subscribe {
                val dialogFg = ListDialogFragment.getInstance(cities as ArrayList<String>)
                dialogFg.show(childFragmentManager, "City")
                dialogFg.itemClickPositionSubject
                    .subscribe { clickedPosition ->
                        run {
                            dialogFg.dismissAllowingStateLoss()
                            getTemperature(binding, cities[clickedPosition])
                        }
                    }
            }
    }

    private fun getTemperature(binding: FragmentWeatherBinding, city: String) {
        viewModel.getWeather(city).observe(viewLifecycleOwner, Observer {
            Timber.d("Response: %s", Gson().toJson(it.data))
            when (it.status) {
                Result.Status.SUCCESS -> {
                    if (it.data?.main != null) {
                        updateSelectedCityWeather(binding, city, it.data.main.feelsLike)
                    }
                }
                Result.Status.LOADING -> {
                }
                Result.Status.ERROR -> {
                }
            }
        })
    }

    private fun updateSelectedCityWeather(
        binding: FragmentWeatherBinding,
        city: String,
        temperature: Float
    ) {
        binding.cityText.text = "Weather in $city"
        binding.temperature = temperature
    }

    override fun getViewId() = R.layout.fragment_weather
    override fun injectBinding(view: View) = DataBindingUtil.bind<FragmentWeatherBinding>(view)!!

    companion object {
        fun getInstance() = WeatherFragment()
    }
}