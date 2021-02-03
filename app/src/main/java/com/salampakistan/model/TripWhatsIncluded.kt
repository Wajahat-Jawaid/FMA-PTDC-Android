package com.salampakistan.model

import android.os.Parcel
import android.os.Parcelable

data class TripWhatsIncluded(
    val icon: String,
    val label: String,
    val value: String
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(icon)
        parcel.writeString(label)
        parcel.writeString(value)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TripWhatsIncluded> {
        override fun createFromParcel(parcel: Parcel): TripWhatsIncluded {
            return TripWhatsIncluded(parcel)
        }

        override fun newArray(size: Int): Array<TripWhatsIncluded?> {
            return arrayOfNulls(size)
        }
    }
}