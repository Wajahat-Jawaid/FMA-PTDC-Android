package com.salampakistan.ui.fragments.locationdetails.poi

import android.Manifest
import android.content.pm.PackageManager
import android.location.Geocoder
import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentPoiBinding
import com.salampakistan.model.POI
import com.salampakistan.model.response.getpoiresponse.Data
import com.salampakistan.network.Result
import com.salampakistan.ui.custom.CustomSupportMapFragment
import com.salampakistan.ui.fragments.locationdetails.LocationDetailsFragment
import com.salampakistan.utils.getDrawable
import java.util.*
import kotlin.collections.ArrayList


/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class POIFragment : BaseFragment<FragmentPoiBinding>(), Injectable, OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var viewModel: POIViewModel
    private lateinit var binding: FragmentPoiBinding
    private lateinit var surroundings: ArrayList<POI>
    private lateinit var coordinates: FloatArray
    private lateinit var locationName: String
    private lateinit var selectedPOI: POI
    private val LOCATION_PERMISSION = 101
    private lateinit var mapFragment: CustomSupportMapFragment

    override fun handleArguments(arguments: Bundle) {
        surroundings = arguments.getParcelableArrayList(SURROUNDINGS)!!
        coordinates = arguments.getFloatArray(COORDINATES)!!
        locationName = arguments.getString(LOCATIONNAME)!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = injectViewModel(viewModelFactory)
        binding = injectBinding(view)
        binding.fragment = this
        super.onViewCreated(view, savedInstanceState)
//        getData()
        setUpMap()
        if (::surroundings.isInitialized && !surroundings.isNullOrEmpty()) {
            binding.text = surroundings[0].name
            binding.poiNameText.setCompoundDrawablesWithIntrinsicBounds(
                getDrawable(
                    surroundings[0].name,
                    context!!
                ), null, resources.getDrawable(R.drawable.ic_dropdown), null
            );
        } else {
            binding.text = getString(R.string.no_attraction_point)
        }
    }

    fun showPOIsPopup() {
//        listOf("hotels", "hostels", "bnb", "campings", "group houses", "family trips", "group excursions", "hiking", "museums", "sports and adventures", "zoos and animal parks", "mountain trails", "food", "guide", "weather", "routes")
        if (::surroundings.isInitialized && !surroundings.isNullOrEmpty()) {
            val dialogFg = POIsDialogFragment.getInstance(surroundings)
            dialogFg.show(childFragmentManager, "POI")
            dialogFg.poiSelectionSubject
                .subscribe {
                    run {
                        selectedPOI = it
                        dialogFg.dismissAllowingStateLoss()
                        getPOIPlaces(coordinates, it.typeKey)
                        updateSelectedPOIText()
                    }
                }
        }
        else {
            showSnack("No discoverable surrounding.")
        }
    }

    private fun getPOIPlaces(coordinates: FloatArray, typeKey: String) {
        viewModel.getPOIPlaces(coordinates, typeKey).observe(viewLifecycleOwner, Observer {
            showProgressBar()
            when (it.status) {
                Result.Status.SUCCESS -> {
                    if (it.data?.data != null) {
                        updateLocationUI(it.data?.data)
                        hideProgressBar()
                    }
                }
                Result.Status.LOADING -> {
                }
                Result.Status.ERROR -> {
                    hideProgressBar()
                }
            }
        })
    }

    private fun updateSelectedPOIText() {
        if (::selectedPOI.isInitialized) {
            binding.text = selectedPOI.name
            binding.poiNameText.setCompoundDrawablesWithIntrinsicBounds(
                getDrawable(
                    selectedPOI.name,
                    context!!
                ), null, resources.getDrawable(R.drawable.ic_dropdown), null
            );
        } else {
            binding.text = getString(R.string.no_attraction_point)
        }

    }


    private fun setUpMap() {
        mapFragment =
            childFragmentManager.findFragmentById(R.id.mapFragment) as CustomSupportMapFragment
        mapFragment!!.getMapAsync(this)

    }

    private fun updateLocationUI(data: List<Data>) {
        mMap.clear()
        mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
        mMap.uiSettings.isZoomControlsEnabled = true;
        val location = LatLng(coordinates[1].toDouble(), coordinates[0].toDouble())
        mMap.moveCamera(CameraUpdateFactory.newLatLng(location))
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location, 10.0f))
        for (item in data) {
            val loc = LatLng(item.location.coordinates[1], item.location.coordinates[0])
            try {
                mMap.addMarker(
                    MarkerOptions()
                        .position(loc)
                        .title(item.name.capitalize())
                )
            } catch (e: Exception) {
            }
        }
    }

    override fun onMapReady(p0: GoogleMap?) {
        mMap = p0!!
        mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
        mMap.uiSettings.isZoomControlsEnabled = true;

        val location = LatLng(coordinates[1].toDouble(), coordinates[0].toDouble())
        mMap.moveCamera(CameraUpdateFactory.newLatLng(location))
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location, 15.0f))

        val mScrollView = (parentFragment as LocationDetailsFragment).binding.scrollView

        mapFragment.setListener(object : CustomSupportMapFragment.OnTouchListener {
            override fun onTouch() {
                mScrollView.requestDisallowInterceptTouchEvent(true)
            }
        })
        try {
            mMap.addMarker(
                MarkerOptions()
                    .position(location)
                    .title(locationName)
            )
        } catch (e: Exception) {
        }

    }

    override fun getViewId() = R.layout.fragment_poi

    override fun injectBinding(view: View) = DataBindingUtil.bind<FragmentPoiBinding>(view)!!

    companion object {
        private val TAG = POIFragment::class.java.simpleName
        private val SURROUNDINGS = "$TAG.surroundings"
        private val LOCATIONNAME = "$TAG.locationname"
        private val COORDINATES = "$TAG.coordinates"
        fun getInstance(
            locationName: String,
            surroundings: ArrayList<POI>,
            coordinates: FloatArray?
        ): POIFragment {
            val fg = POIFragment()
            val bundle = Bundle()
            bundle.putParcelableArrayList(SURROUNDINGS, surroundings)
            bundle.putString(LOCATIONNAME, locationName)
            bundle.putFloatArray(COORDINATES, coordinates)
            fg.arguments = bundle
            return fg
        }

    }
}