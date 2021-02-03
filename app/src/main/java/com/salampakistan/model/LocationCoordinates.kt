package com.salampakistan.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
data class LocationCoordinates(
    val coordinates: FloatArray, @SerializedName("_id") val id: String?,
    val type:String?) : Parcelable {

    constructor(parcel: Parcel) : this(parcel.createFloatArray()!!, parcel.readString(), parcel.readString())

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeFloatArray(coordinates)
        dest?.writeString(id)
        dest?.writeString(type)
    }

    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<LocationCoordinates> {
        override fun createFromParcel(parcel: Parcel): LocationCoordinates {
            return LocationCoordinates(parcel)
        }

        override fun newArray(size: Int): Array<LocationCoordinates?> {
            return arrayOfNulls(size)
        }
    }
}