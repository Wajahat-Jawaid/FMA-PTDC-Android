package com.salampakistan.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.MainActivity
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.databinding.FragmentImageViewBinding
import com.salampakistan.ui.adapters.ImagePagerAdapter
import com.salampakistan.utils.DepthPagerTransformer
import com.salampakistan.utils.FragmentTransitionHelper
import com.salampakistan.utils.RxClicks

class ImageViewFragment : BaseFragment<FragmentImageViewBinding>() {

    lateinit var imagePagerAdapter: ImagePagerAdapter
    lateinit var images: ArrayList<String>
    var index: Int = 0
    lateinit var binding: FragmentImageViewBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)
        setupImagePager()
    }

    private fun setupImagePager() {
        imagePagerAdapter = ImagePagerAdapter(images)
        binding.viewPager.adapter = imagePagerAdapter
        binding.viewPager.setPageTransformer(true,DepthPagerTransformer())
        binding.viewPager.setCurrentItem(index!!,true)
        RxView.clicks(binding.closeImg).subscribe {
            navController.navigateUp()
        }

        binding.viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                binding.statusText.text = "${position + 1} / ${images.size}"
            }

            override fun onPageSelected(position: Int) {}

            override fun onPageScrollStateChanged(state: Int) {}
        })
    }

    override fun handleArguments(arguments: Bundle) {
        super.handleArguments(arguments)
        images = arguments.getStringArrayList(IMAGES)!!
        index = arguments.getInt(INDEX)
    }

    override fun onResume() {
        super.onResume()
        (activity as MainActivity).hideBottomNav()
    }

    override fun onStop() {
        super.onStop()
        (activity as MainActivity).showBottomNav()
    }


    override fun getViewId(): Int = R.layout.fragment_image_view

    override fun injectBinding(view: View): FragmentImageViewBinding = DataBindingUtil.bind(view)!!

    companion object {
        private val TAG = ImageViewFragment::class.java.simpleName

        val IMAGES = "$TAG.images"
        val INDEX = "$TAG.index"

        fun getInstance(images: ArrayList<String>): ImageViewFragment {
            val fg = ImageViewFragment()
            FragmentTransitionHelper.setupTransitionFromBottom(fg)
            val bundle = Bundle()
            bundle.putStringArrayList(IMAGES, images)
            fg.arguments = bundle
            return fg
        }
    }
}