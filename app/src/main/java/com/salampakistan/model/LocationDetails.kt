package com.salampakistan.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.salampakistan.network.JSONKeys

class LocationDetails (
    @SerializedName(JSONKeys._id) val id: String,
    val name: String,
    val description: String,
    val longDescription: String,
    val locationType: String,
    val thumbnails: ArrayList<String>,
    val slug: String,
    val photos: ArrayList<String>,
    val surroundings: ArrayList<POI>,
    val location: LocationCoordinates
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.createStringArrayList()!!,
        parcel.readString()!!,
        parcel.createStringArrayList()!!,
        parcel.createTypedArrayList(POI)!!,
        parcel.readParcelable<LocationCoordinates>(LocationCoordinates::class.java.classLoader)!!
    )

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(id)
        dest?.writeString(name)
        dest?.writeString(description)
        dest?.writeString(longDescription)
        dest?.writeString(locationType)
        dest?.writeStringList(thumbnails)
        dest?.writeString(slug)
        dest?.writeStringList(photos)
        dest?.writeTypedList(surroundings)
        dest?.writeParcelable(location, Parcelable.PARCELABLE_WRITE_RETURN_VALUE)
    }

    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<Location> {
        override fun createFromParcel(parcel: Parcel): Location {
            return Location(parcel)
        }

        override fun newArray(size: Int): Array<Location?> {
            return arrayOfNulls(size)
        }
    }
}