package com.salampakistan.ui.fragments.itinerary

import android.view.ViewGroup
import android.view.ViewTreeObserver
import androidx.databinding.DataBindingUtil
import com.salampakistan.BR
import com.salampakistan.R
import com.salampakistan.databinding.RowItineraryBinding
import com.salampakistan.model.Itinerary
import com.salampakistan.ui.adapters.BaseListAdapter
import timber.log.Timber

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class ItinerariesAdapter : BaseListAdapter<RowItineraryBinding, Itinerary>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewDataBinding =
            DataBindingUtil.bind<RowItineraryBinding>(parent.inflate(R.layout.row_itinerary))
        return ViewHolder(viewDataBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding = holder.binding as RowItineraryBinding
        binding.setVariable(BR.model, items[position])
        val itineraryObjectItemsBefore = items[position].description.split("\n")
        Timber.d("itineraryObjectItems before: %s", itineraryObjectItemsBefore.toString())
        val s2 = mutableListOf<String>()
        var s5 = ""
        var s4 = StringBuilder()
        for (i in itineraryObjectItemsBefore.indices) {
            s4.append("•  ")
            s4.append(itineraryObjectItemsBefore[i])
            if (i != (itineraryObjectItemsBefore.size-1))
                s4.append("\n")
        }
//        for (text in itineraryObjectItemsBefore) {
////            s2.add("• $text\n")
//        }
        val s3 = s2.joinToString(",")
        Timber.d("s4: %s", s4.toString())
        binding.itineraryText.text = s4.toString()
        val itineraryText = binding.itineraryText
        val s1 =
            itineraryObjectItemsBefore.forEachIndexed { index, text -> "hello${itineraryObjectItemsBefore[index]}\n" }
        Timber.d("itineraryObjectItems after: %s", s2.toString())
        binding.itineraryLayout.viewTreeObserver.addOnGlobalLayoutListener(object :
            ViewTreeObserver.OnGlobalLayoutListener {
            override fun onGlobalLayout() {
                val params = binding.daySeparatorVertical.layoutParams
                params.height = binding.itineraryLayout.height
                binding.itineraryLayout.viewTreeObserver.removeOnGlobalLayoutListener(this)
                binding.daySeparatorVertical.layoutParams = params
            }
        })
        super.onBindViewHolder(holder, position)
    }
}