package com.salampakistan.model.seasons

import android.os.Parcel
import android.os.Parcelable

data class Data(
    val _id: String,
    val alias: String,
    val isActive: Boolean,
    val isFeatured: Boolean,
    val longDescription: String,
    val seasonalLong: String,
    val seasonalShort: String,
    val shortDescription: String,
    val sightLong: String,
    val sightShort: String,
    val thumbnail: String,
    val title: String,
    val travelingLong: String,
    val travelingShort: String
):Parcelable{

    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readBoolean()!!,
        parcel.readBoolean()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
        )
    override fun writeToParcel(desc: Parcel?, p1: Int) {
        desc?.writeString(_id)
        desc?.writeString(alias)
        desc?.writeBoolean(isActive)
        desc?.writeBoolean(isFeatured)
        desc?.writeString(longDescription)
        desc?.writeString(seasonalLong)
        desc?.writeString(seasonalShort)
        desc?.writeString(shortDescription)
        desc?.writeString(sightLong)
        desc?.writeString(sightShort)
        desc?.writeString(thumbnail)
        desc?.writeString(title)
        desc?.writeString(travelingLong)
        desc?.writeString(travelingShort)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Data> {
        override fun createFromParcel(parcel: Parcel): Data {
            return Data(parcel)
        }

        override fun newArray(size: Int): Array<Data?> {
            return arrayOfNulls(size)
        }
    }

}