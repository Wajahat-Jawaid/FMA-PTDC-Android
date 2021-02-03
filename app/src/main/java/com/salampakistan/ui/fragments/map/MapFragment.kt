package com.salampakistan.ui.fragments.map

import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.FragmentMapBinding
import com.salampakistan.databinding.RowMapPoiBinding
import com.salampakistan.model.mapLocationResponse.Surrounding
import com.salampakistan.model.response.getpoiresponse.Data
import com.salampakistan.network.Result
import com.salampakistan.ui.adapters.MapPOIListAdapter
import com.salampakistan.ui.custom.CustomSupportMapFragment
import com.salampakistan.utils.InputUtils


class MapFragment : BaseFragment<FragmentMapBinding>(), Injectable, OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var viewModel: MapViewModel
    private lateinit var binding: FragmentMapBinding
    private lateinit var mapFragment: CustomSupportMapFragment
    lateinit var adapter: MapPOIListAdapter<RowMapPoiBinding, Surrounding>
    lateinit var name:String
    lateinit var surrounding: List<Surrounding>
    lateinit var coordinates: List<Double>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        viewModel = injectViewModel(viewModelFactory)
        super.onViewCreated(view, savedInstanceState)


        setUpMap()
        getData()


        setAdapterClick()
    }

    private fun setAdapterClick() {
        adapter = MapPOIListAdapter(context!!, R.layout.row_map_poi)
        binding.recyclerView.adapter = adapter
        adapter.itemClickSubject.subscribe {
            getPOIData(name, it, coordinates)
        }
    }

    private fun getData() {
        viewModel.getLocations().observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            when (it.status) {
                Result.Status.LOADING -> {
                }
                Result.Status.SUCCESS -> {
                    if (it.data?.data != null) {
                        initiateLocationAutoCompleteAdapter(it.data.data.filter { location -> location.locationType == "city" }
                            .filter { !it.name.isNullOrEmpty() }.toTypedArray())
                    }
                }
                Result.Status.ERROR -> {
                }
            }
        })
    }

    private fun initiateLocationAutoCompleteAdapter(cities: Array<com.salampakistan.model.mapLocationResponse.Data>) {
        val adapter = ArrayAdapter<String>(
            context!!,
            R.layout.row_autocomplete_text_view,
            cities.map { it.name.capitalize() }
        )
        binding.cityText.setAdapter(adapter)
        binding.cityText.setOnItemClickListener { parent, view, position, id ->
            InputUtils.hideSoftKeyboard(activity!!)
            val location =
                cities.filter { it.name.capitalize() == binding.cityText.text.toString() }
                    .toTypedArray()[0]
            name = location.name
            surrounding = location.surroundings
            coordinates = location.location.coordinates
            setView()
            binding.cityText.nextFocusDownId
        }
    }

    private fun getPOIData(
        name: String,
        surrounding: Surrounding,
        coordinates: List<Double>
    ) {
        viewModel.getLocationPOIs(coordinates, surrounding.typeKey).observe(viewLifecycleOwner,
            androidx.lifecycle.Observer {
                when (it.status) {
                    Result.Status.LOADING -> {
                    }
                    Result.Status.SUCCESS -> {
                        updateLocationPOIOnMap(name, it.data?.data, coordinates)
                    }
                    Result.Status.ERROR -> {
                    }
                }
            })
    }

    private fun setView( ) {
        binding.recyclerView.scrollToPosition(0)
        adapter.updateContent(surrounding)


        mMap.clear()
        val location = LatLng(coordinates[1], coordinates[0])
        mMap.moveCamera(CameraUpdateFactory.newLatLng(location))
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location, 15.0f))
        mMap.addMarker(
            MarkerOptions()
                .position(location)
                .title(name.capitalize())
        )
    }

    private fun updateLocationPOIOnMap(name: String, data: List<Data>?, coordinates: List<Double>) {
        mMap.clear()
        val location = LatLng(coordinates[1], coordinates[0])
        mMap.moveCamera(CameraUpdateFactory.newLatLng(location))
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location, 11.0f))
        mMap.addMarker(
            MarkerOptions()
                .position(location)
                .title(name.capitalize())
        )

        if (data != null) {
            for (item in data) {
                val loc = LatLng(item.location.coordinates[1], item.location.coordinates[0])
                try {
                    mMap.addMarker(
                        MarkerOptions()
                            .position(loc)
                            .title(item.name)
                            .icon(getMarkerIcon())
                    )
                } catch (e: Exception) {
                    print(e.localizedMessage)
                }
            }
        }
    }

    private fun getMarkerIcon(): BitmapDescriptor? {
        val drawable = context!!.getDrawable(R.drawable.ic_map_pin)
        val canvas = Canvas()
        val bitmap = Bitmap.createBitmap(
            drawable!!.intrinsicWidth,
            drawable.intrinsicHeight,
            Bitmap.Config.ARGB_8888
        )
        canvas.setBitmap(bitmap)
        drawable.setBounds(0, 0, drawable.intrinsicWidth, drawable.intrinsicHeight)
        drawable.draw(canvas)
        return BitmapDescriptorFactory.fromBitmap(bitmap)
    }

    private fun setUpMap() {
        mapFragment =
            childFragmentManager.findFragmentById(R.id.mapFragment) as CustomSupportMapFragment
        mapFragment!!.getMapAsync(this)

    }

    override fun onMapReady(p0: GoogleMap?) {
        mMap = p0!!
        mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
        mMap.uiSettings.isZoomControlsEnabled = true;

        val location = LatLng(24.883221, 67.144376)
        mMap.moveCamera(CameraUpdateFactory.newLatLng(location))
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location, 15.0f))

        val mScrollView = binding.scrollView

        mapFragment.setListener(object : CustomSupportMapFragment.OnTouchListener {
            override fun onTouch() {
                mScrollView.requestDisallowInterceptTouchEvent(true)
            }
        })

        try {
//            mMap.addMarker(
//                MarkerOptions()
//                    .position(location)
//                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.logo))
//            )
        } catch (e: Exception) {
        }
    }

    override fun getViewId(): Int = R.layout.fragment_map

    override fun injectBinding(view: View): FragmentMapBinding = DataBindingUtil.bind(view)!!


    companion object {
        fun newInstance() = MapFragment()
    }
}
