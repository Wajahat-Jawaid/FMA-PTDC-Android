package com.salampakistan.ui.fragments.home

import android.animation.Animator
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentHomeBinding
import com.salampakistan.model.enums.BookingEntity
import com.salampakistan.ui.fragments.currency.CurrencyFragment
import com.salampakistan.ui.fragments.home.seasonexperiences.SeasonsSectionFragment
import com.salampakistan.ui.fragments.home.whattodo.WhatToDoSectionFragment
import com.salampakistan.ui.fragments.weather.WeatherFragment
import com.salampakistan.utils.Constants
import com.salampakistan.utils.RxClicks
import timber.log.Timber
import java.lang.Exception


/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class HomeFragment : BaseFragment<FragmentHomeBinding>(), Injectable {

    private var dataLoaded = false
    private lateinit var viewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        binding.fragment = this
        viewModel = injectViewModel(viewModelFactory)
        super.onViewCreated(view, savedInstanceState)
//        setChangeableSalamText(binding, items[0])
//        binding.temperature = 23f
        playYoutube(binding)
        setView()
    }

    private fun setView() {
        RxView.clicks(binding.searchBtn).subscribe {
            try {
                navController.navigate(R.id.action_homeFragment_to_searchFragment)
            } catch (e: Exception) {
            }
        }


        RxView.clicks(binding.hotelBooking.root).subscribe {
            try {
                navController.navigate(R.id.action_homeFragment_to_bookingHotelFragment)
            } catch (e: Exception) {
            }
        }

        RxView.clicks(binding.busBooking.root).subscribe {
            try {
                navController.navigate(R.id.action_homeFragment_to_busBookingSearchFragment)
            } catch (e: Exception) {
            }
        }
        RxView.clicks(binding.flightBooking.root).subscribe {
            try {
                navController.navigate(R.id.action_homeFragment_to_bookingFlightFragment)
            } catch (e: Exception) {
            }
        }

    }

    private fun addCategoryFragments() {
        childFragmentManager.beginTransaction()
            .add(R.id.where_to_go_layout, WhereToGoSectionFragment.getInstance())
            .add(R.id.what_to_do_layout, WhatToDoSectionFragment.getInstance())
            .add(R.id.seasons_layout, SeasonsSectionFragment.getInstance())
            .add(R.id.trips_you_cannot_miss_layout, TripsCannotMissSectionFragment.getInstance())
            .add(R.id.expert_tips_layout, ExpertTipsSectionFragment.getInstance())
            .commit()
        dataLoaded = true
    }

    private fun addLiveWidgetsFragments() {
        childFragmentManager.beginTransaction()
            .add(com.salampakistan.R.id.weather_layout, WeatherFragment.getInstance())
            .add(com.salampakistan.R.id.currency_layout, CurrencyFragment.getInstance())
            .commit()
    }

    fun onCheckVisaBtnClicked() {
        navController.navigate(R.id.action_homeFragment_to_checkVisaStatusFragment)
    }

    fun onBookingLayoutClicked(type: BookingEntity) {

        val bundle = Bundle()
        bundle.putSerializable(Constants.BOOKINGTYPE, type)
        navController.navigate(R.id.action_homeFragment_to_bookingFragment, bundle)
//        addFragment(BookingFragment.getInstance(type))
    }

    private fun playYoutube(binding: FragmentHomeBinding) {
        val youtubeWebView = binding.webView //todo find or bind web view
        val myVideoYoutubeId = "fW2aPXT2-DE"

        youtubeWebView.setWebViewClient(object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                return false
            }
        })

        val webSettings = youtubeWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true

        youtubeWebView.loadUrl("https://www.youtube.com/embed/$myVideoYoutubeId")
    }

    val items = listOf("Salam", "bonjour", "Namaste", "ala", "jambo")

    //        binding.salamChangeableText.text = text
    var index = 0

    private fun setChangeableSalamText(binding: FragmentHomeBinding, text: String) {
//        TransitionManager.beginDelayedTransition(binding.bannerLayout)

        binding.salamChangeableText.animate().withLayer()
            .rotationX(90f)
            .setDuration(500)
//            .setInterpolator(CycleInterpolator(1000f / 60000f))
            .withEndAction {
                binding.salamChangeableText.rotationX = -90f
                binding.salamChangeableText.animate().withLayer()
                    .rotationX(0f)
                    .setDuration(500)
                    .setListener(object : Animator.AnimatorListener {
                        override fun onAnimationRepeat(animation: Animator?) {
                            Timber.d("onAnimationRepeat")
                        }

                        override fun onAnimationEnd(animation: Animator?) {
                            Timber.d("onAnimationEnd")
                            binding.salamChangeableText.text = text
                            Handler().postDelayed({
                                index = if (index == items.size - 1) 0 else ++index
//                                setChangeableSalamText(binding, items[index])
                            }, 2000)
                        }

                        override fun onAnimationCancel(animation: Animator?) {
                        }

                        override fun onAnimationStart(animation: Animator?) {
                        }
                    })
                    .start()
            }
    }

    override fun transitionComplete() {
        if (!dataLoaded) {
            addCategoryFragments()
            addLiveWidgetsFragments()
        }
    }

    override fun getViewId() = com.salampakistan.R.layout.fragment_home
    override fun injectBinding(view: View) = DataBindingUtil.bind<FragmentHomeBinding>(view)!!

    companion object {
        fun getInstance() = HomeFragment()
    }
}