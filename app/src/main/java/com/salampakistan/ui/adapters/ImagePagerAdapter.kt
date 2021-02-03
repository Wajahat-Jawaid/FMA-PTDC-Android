package com.salampakistan.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.salampakistan.R

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class ImagePagerAdapter(private val urls: List<String>,private val index: Int? = null) : PagerAdapter() {


    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val imageLayout = LayoutInflater.from(container.context)
            .inflate(R.layout.row_image_view_pager, container, false)!!
//        (imageLayout.findViewById(R.id.image) as ImageView).setImageResource(images[position])

        Glide.with(container.context)
            .load(urls[position])
            .into(imageLayout.findViewById(R.id.image))

        container.addView(imageLayout)

        return imageLayout
    }

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as View)
    }

    override fun isViewFromObject(view: View, obj: Any) = view == obj
    override fun getCount() = urls.size
}