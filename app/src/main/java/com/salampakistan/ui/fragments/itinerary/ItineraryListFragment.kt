package com.salampakistan.ui.fragments.itinerary

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.databinding.FragmentItinerariesBinding
import com.salampakistan.model.Itinerary
import com.salampakistan.utils.FragmentTransitionHelper

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class ItineraryListFragment : BaseFragment<FragmentItinerariesBinding>(), Injectable {

    private lateinit var binding: FragmentItinerariesBinding
    private lateinit var itineraries: ArrayList<Itinerary>
    private val adapter = ItinerariesAdapter()

    override fun handleArguments(arguments: Bundle) {
        itineraries = arguments.getParcelableArrayList(ITINERARIES)!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        super.onViewCreated(view, savedInstanceState)
        setData()
    }

    private fun setData() {
        binding.recyclerView.adapter = adapter
        adapter.items = itineraries
    }

    override fun getViewId() = R.layout.fragment_itineraries
    override fun injectBinding(view: View) =
        DataBindingUtil.bind<FragmentItinerariesBinding>(view)!!

    companion object {

        private val TAG = ItineraryListFragment::class.java.simpleName
        private val ITINERARIES = "$TAG.itineraries"

        fun getInstance(itineraries: ArrayList<Itinerary>): ItineraryListFragment {
            val fg = ItineraryListFragment()
            FragmentTransitionHelper.setupTransitionFromBottom(fg)
            val bundle = Bundle()
            bundle.putParcelableArrayList(ITINERARIES, itineraries)
            fg.arguments = bundle
            return fg
        }
    }
}