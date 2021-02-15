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
import kotlin.math.roundToInt

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
        else binding.distanceText.visibility = View.VISIBLE
        if(position != items.size - 1){
            binding.distanceText.text = getLocationsDifference(items[position].location,items[position+1].location)
        }
        super.onBindViewHolder(holder, position)
    }

    private fun getLocationsDifference(beginLocation: LocationCoordinates, destinationLocation: LocationCoordinates): String {
        val startLocation = Location("beginLocation")
        startLocation.latitude = beginLocation.coordinates[1].toDouble()
        startLocation.longitude = beginLocation.coordinates[0].toDouble()
        val endLocation = Location("destinationLocation")
        endLocation.latitude = destinationLocation.coordinates[1].toDouble()
        endLocation.longitude = destinationLocation.coordinates[0].toDouble()
        return "${String.format("%.2f",(startLocation.distanceTo(endLocation) / 1000))} km"
    }


}