package com.salampakistan.ui.fragments.booking.hotel.hoteldetails

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.jakewharton.rxbinding.view.RxView
import com.salampakistan.ui.custom.layoutManager.SliderLayoutManager
import com.salampakistan.R
import com.salampakistan.base.BaseFragment
import com.salampakistan.dagger.Injectable
import com.salampakistan.dagger.injectViewModel
import com.salampakistan.databinding.*
import com.salampakistan.model.Classint
import com.salampakistan.model.hotelsearchresponse.HotelAmenities
import com.salampakistan.model.hotelsearchresponse.Photo
import com.salampakistan.ui.adapters.SimpleListAdapter
import com.salampakistan.ui.fragments.ImageViewFragment
import com.salampakistan.ui.fragments.booking.hotel.bookingdetails.HotelBookingDetailsFragment
import com.salampakistan.utils.Preferences

class HotelDetailsFragment : BaseFragment<FragmentHotelDetailsBinding>(), Injectable {

    private lateinit var roomAdapter: SimpleListAdapter<RowPropertyListBinding, Classint>
    private lateinit var roomPhotoAdapter: SimpleListAdapter<RowRoomPhotoBinding, Photo>
    private lateinit var binding: FragmentHotelDetailsBinding

    private lateinit var city: String
    private lateinit var hotelName: String
    private lateinit var startDate: String
    private lateinit var endDate: String
    private var adult: Int = 0
    private var child: Int = 0
    private var room: Int = 0
    private var days: Int = 0
    private var perDayRates: Int = 0
    private lateinit var photos: ArrayList<String>
    private var hotelAmenities: ArrayList<HotelAmenities> = ArrayList()

    lateinit var arrPhotos: ArrayList<Photo>
    private lateinit var viewModel: HotelDetailsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = injectBinding(view)
        viewModel = injectViewModel(viewModelFactory)
        super.onViewCreated(view, savedInstanceState)

        setView()
    }

    private fun setView() {


        val amenitiesBuilder = StringBuilder()
        hotelAmenities.map {
            amenitiesBuilder.append("- ")
            amenitiesBuilder.append(it.name+"\n")
        }
        binding.amenityText.text = amenitiesBuilder.toString()

        arrPhotos = ArrayList()
        photos.map {
            arrPhotos.add((Photo(it)))
        }

        if (hotelAmenities.isNullOrEmpty()) binding.amenityLayout.visibility = View.GONE
        binding.titleText.text = hotelName.toLowerCase()

        //junk data

        val intArr = ArrayList<Classint>()
        intArr.add(Classint("https://i.pinimg.com/originals/cc/18/8c/cc188c604e58cffd36e1d183c7198d21.jpg"))
        intArr.add(Classint("https://i.pinimg.com/originals/cc/18/8c/cc188c604e58cffd36e1d183c7198d21.jpg"))
        intArr.add(Classint("https://i.pinimg.com/originals/cc/18/8c/cc188c604e58cffd36e1d183c7198d21.jpg"))

        roomAdapter = SimpleListAdapter(R.layout.row_property_list)
        roomPhotoAdapter = SimpleListAdapter(R.layout.row_room_photo)

        binding.recRoom.adapter = roomAdapter
        binding.recPhotos.adapter = roomPhotoAdapter


        roomAdapter.updateContent(intArr)
        roomPhotoAdapter.updateContent(arrPhotos)

        if (!arrPhotos.isNullOrEmpty())
            Glide.with(context!!).load(arrPhotos[0].url).into(binding.placeHolder)

        roomPhotoAdapter.itemClickSubject.subscribe {
            try {
                val bundle = Bundle()
                bundle.putStringArrayList(
                    ImageViewFragment.IMAGES,
                    arrPhotos.map { it.url }.toList() as java.util.ArrayList<String>
                )
                bundle.putInt(ImageViewFragment.INDEX, arrPhotos.indexOf(it))
                navController.navigate(
                    R.id.action_hotelDetailsFragment_to_imageViewFragment,
                    bundle
                )
            } catch (e: java.lang.Exception) {
            }
        }
        setHorizontalPicker()
//        binding.amenityRec.layoutManager = GridLayoutManager(context!!, 2)
        RxView.clicks(binding.backBtn).subscribe {
            navController.navigateUp()
        }

        RxView.clicks(binding.booknowBtn).subscribe {

            try {
                val bundle = Bundle()
                bundle.putString(HotelBookingDetailsFragment.HOTELNAME, hotelName)
                bundle.putString(HotelBookingDetailsFragment.CITY, city)
                bundle.putString(HotelBookingDetailsFragment.STARTDATE, startDate)
                bundle.putString(HotelBookingDetailsFragment.ENDDATE, endDate)
                bundle.putInt(HotelBookingDetailsFragment.ADULT, adult)
                bundle.putInt(HotelBookingDetailsFragment.CHILD, child)
                bundle.putInt(HotelBookingDetailsFragment.ROOMS, room)
                bundle.putInt(HotelBookingDetailsFragment.DAY, days)
                bundle.putInt(HotelBookingDetailsFragment.PERDAYRATE, perDayRates)
                bundle.putParcelableArrayList(
                    HotelBookingDetailsFragment.HOTELAMENITIES,
                    hotelAmenities
                )
                navController.navigate(
                    R.id.action_hotelDetailsFragment_to_hotelBookingDetailsFragment,
                    bundle
                )
            } catch (e: Exception) {
            }
        }
    }

    override fun handleArguments(arguments: Bundle) {
        hotelName = arguments?.getString(HotelDetailsFragment.HOTELNAME)!!
        city = arguments?.getString(HotelDetailsFragment.CITY)!!
        startDate = arguments?.getString(HotelDetailsFragment.STARTDATE)!!
        endDate = arguments?.getString(HotelDetailsFragment.ENDDATE)!!
        adult = arguments?.getInt(HotelDetailsFragment.ADULT)!!
        child = arguments?.getInt(HotelDetailsFragment.CHILD)!!
        room = arguments?.getInt(HotelDetailsFragment.ROOMS)!!
        days = arguments?.getInt(HotelDetailsFragment.DAY)!!
        perDayRates = arguments?.getInt(HotelDetailsFragment.PERDAYRATE)!!
        photos = arguments?.getStringArrayList(HotelDetailsFragment.HOTELPHOTOS)!!
        hotelAmenities.addAll(
            arguments?.getStringArrayList(HotelDetailsFragment.HOTELAMENITIES)!!
                .map { HotelAmenities(it) })
    }

    private fun setHorizontalPicker() {

        // Setting layout manager
        binding.recRoom.layoutManager = SliderLayoutManager(context!!)
    }


    override fun getViewId(): Int = R.layout.fragment_hotel_details

    override fun injectBinding(view: View): FragmentHotelDetailsBinding =
        DataBindingUtil.bind(view)!!

    companion object {
        private val TAG = HotelDetailsFragment::class.java.simpleName
        val CITY = "$TAG.city"
        val STARTDATE = "$TAG.startDate"
        val ENDDATE = "$TAG.endDate"
        val ADULT = "$TAG.adult"
        val CHILD = "$TAG.child"
        val ROOMS = "$TAG.rooms"
        val HOTELNAME = "$TAG.hotelName"
        val HOTELPHOTOS = "$TAG.hotelPhotos"
        val HOTELAMENITIES = "$TAG.hotelAmenities"
        val DAY = "$TAG.days"
        val PERDAYRATE = "$TAG.perdayRate"
        fun newInstance() = HotelDetailsFragment()
    }

}