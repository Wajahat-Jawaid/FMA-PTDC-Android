package com.salampakistan.model.response

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class LocationCoordinateData(
    val coordinates:FloatArray?,
    @SerializedName("_id") val id: String?,
    val type:String?):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.createFloatArray(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeFloatArray(coordinates)
        parcel.writeString(id)
        parcel.writeString(type)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<LocationCoordinateData> {
        override fun createFromParcel(parcel: Parcel): LocationCoordinateData {
            return LocationCoordinateData(parcel)
        }

        override fun newArray(size: Int): Array<LocationCoordinateData?> {
            return arrayOfNulls(size)
        }
    }

}