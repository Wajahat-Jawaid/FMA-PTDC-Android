package com.salampakistan.ui.adapters

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.salampakistan.R

class OnboardingPagerAdapter: PagerAdapter() {
    private val images:ArrayList<Drawable> = ArrayList()
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val imageLayout = LayoutInflater.from(container.context)
            .inflate(R.layout.row_image_view_pager, container, false)!!
        images.add(container.context.getDrawable(R.drawable.onboarding_1)!!)
        images.add(container.context.getDrawable(R.drawable.onboarding_2)!!)
        images.add(container.context.getDrawable(R.drawable.onboarding_3)!!)
        (imageLayout.findViewById(R.id.image) as ImageView).setImageDrawable(images[position])

        container.addView(imageLayout)

        return imageLayout
    }


    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as View)
    }

    override fun isViewFromObject(view: View, obj: Any) = view == obj
    override fun getCount() = 3
}