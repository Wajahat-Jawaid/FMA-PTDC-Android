package com.salampakistan.model.hotelsearchresponse

import android.os.Parcel
import android.os.Parcelable

data class HotelAmenities(val name:String):Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString()!!) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<HotelAmenities> {
        override fun createFromParcel(parcel: Parcel): HotelAmenities {
            return HotelAmenities(parcel)
        }

        override fun newArray(size: Int): Array<HotelAmenities?> {
            return arrayOfNulls(size)
        }
    }
}