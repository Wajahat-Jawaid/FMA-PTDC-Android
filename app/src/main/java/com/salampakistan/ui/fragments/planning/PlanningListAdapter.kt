package com.salampakistan.ui.fragments.planning

import android.location.Location
import android.view.View
import com.google.android.gms.maps.model.LatLng
import com.salampakistan.BR
import com.salampakistan.R
import com.salampakistan.databinding.RowPlanningBinding
import com.salampakistan.model.LocationCoordinates
import com.salampakistan.model.WishList
import com.salampakistan.ui.adapters.SimpleListAdapter

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class PlanningListAdapter : SimpleListAdapter<RowPlanningBinding, WishList>(R.layout.row_planning) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding = holder.binding as RowPlanningBinding
        binding.setVariable(BR.model, items[position])
        if (position == items.size - 1) {
            binding.distanceText.visibility = View.INVISIBLE
        }

        if(position != items.size - 1){
            binding.distanceText.text = getLocationsDifference(items[position].location,items[position+1].location)
        }
        super.onBindViewHolder(holder, position)
    }

    private fun getLocationsDifference(startLocation: LocationCoordinates, endLocation: LocationCoordinates): CharSequence? {
        val startLocation = Location("StartLocation")
        startLocation.latitude = 0.0
        startLocation.longitude = 0.0
        val endLocation = Location("endLocation")
        endLocation.latitude = 0.0
        endLocation.longitude = 0.0
        val loc = LatLng(firstLocatoin.location.coordinates[1].toDouble(), firstLocatoin.location.coordinates[0].toDouble())
        val l = startLocation.distanceTo(endLocation)/1000
    }

}