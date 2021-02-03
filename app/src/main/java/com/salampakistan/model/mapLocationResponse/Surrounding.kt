package com.salampakistan.model.mapLocationResponse

import android.os.Parcel
import android.os.Parcelable

data class Surrounding(
    val _id: String,
    val iconName: String,
    val name: String,
    val typeKey: String
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(_id)
        parcel.writeString(iconName)
        parcel.writeString(name)
        parcel.writeString(typeKey)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Surrounding> {
        override fun createFromParcel(parcel: Parcel): Surrounding {
            return Surrounding(parcel)
        }

        override fun newArray(size: Int): Array<Surrounding?> {
            return arrayOfNulls(size)
        }
    }
}