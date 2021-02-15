package com.salampakistan.ui.onboarding

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.children
import androidx.viewpager.widget.ViewPager
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.MainActivity
import com.salampakistan.R
import com.salampakistan.databinding.ActivityOnboardingBinding
import com.salampakistan.ui.adapters.OnboardingPagerAdapter
import com.salampakistan.utils.DepthPagerTransformer
import com.salampakistan.utils.Preferences

class OnBoardingActivity : AppCompatActivity() {

    lateinit var binding: ActivityOnboardingBinding
    lateinit var adapter: OnboardingPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setView()
//        Preferences(this).setDisplayedOnboarding(true)


        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }

    private fun setView() {
        RxView.clicks(binding.skipText).subscribe {
            startActivity(Intent(this, MainActivity::class.java))
        }

        adapter = OnboardingPagerAdapter()
        binding.imagePager.adapter = adapter
        binding.imagePager.setPageTransformer(true, DepthPagerTransformer())
        binding.tabLayout.setupWithViewPager(binding.imagePager)
        val slidingTabStrip = binding.tabLayout.getChildAt(0) as ViewGroup
        for (i in 0 until (slidingTabStrip.children.count())) {
            val v = slidingTabStrip.getChildAt(i)
            val params = v.layoutParams as (ViewGroup.MarginLayoutParams)
            params.rightMargin = this.resources.getDimension(R.dimen.tab_indicator_margin).toInt()
        }
        binding.imagePager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {}

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                when (position + 1) {
                    1 -> {
                        binding.headingText.text = getString(R.string.explore_destinations)
                        binding.detailText.text = getString(R.string.onboarding_detail_1)
                    }
                    2 -> {
                        binding.headingText.text = getString(R.string.get_a_taste_of_pakistan)
                        binding.detailText.text =
                            getString(R.string.get_information_on_places_you_want_to_nvisit_and_see)
                    }
                    3 -> {
                        binding.headingText.text = getString(R.string.build_your_itinerary)
                        binding.detailText.text = getString(R.string.onboarding_detail_3)
                    }
                }
            }

            override fun onPageSelected(position: Int) {}
        })
    }

    companion object {
        fun newInstance() =
            OnBoardingActivity()
    }
}