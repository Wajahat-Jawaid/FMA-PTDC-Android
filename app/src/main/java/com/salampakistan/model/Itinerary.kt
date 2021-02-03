package com.salampakistan.model

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
data class Itinerary(val description: String, val time: String, val day: Int) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt()
    )

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(description)
        dest?.writeString(time)
        dest?.writeInt(day)
    }

    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<Itinerary> {
        override fun createFromParcel(parcel: Parcel): Itinerary {
            return Itinerary(parcel)
        }

        override fun newArray(size: Int): Array<Itinerary?> {
            return arrayOfNulls(size)
        }
    }
}