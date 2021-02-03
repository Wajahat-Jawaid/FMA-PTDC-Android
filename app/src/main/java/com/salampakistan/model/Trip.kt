package com.salampakistan.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.salampakistan.network.JSONKeys

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
data class Trip(
    @SerializedName(JSONKeys._id) val id: String,
    @SerializedName(JSONKeys.id) val autoId: Int,
    val trimmedSlug: String,
    val title: String,
    val description: String,
    val duration: Int,
    val discount: Int,
    val startingLocation: String,
    val whatsIncluded: List<TripWhatsIncluded?>,
    val locations: List<String>,
    val subLocations: List<String>,
    val categories: List<String>,
    val activities: List<String>,
    val photos: List<String>,
    val itinerary: List<Itinerary>,
    val thumbnail: String,
    val cancellationPolicy: String,
    val eventType: String
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()!!,
        parcel.createTypedArrayList(TripWhatsIncluded)!!,
        parcel.createStringArrayList()!!,
        parcel.createStringArrayList()!!,
        parcel.createStringArrayList()!!,
        parcel.createStringArrayList()!!,
        parcel.createStringArrayList()!!,
        parcel.createTypedArrayList(Itinerary)!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeInt(autoId)
        parcel.writeString(trimmedSlug)
        parcel.writeString(title)
        parcel.writeString(description)
        parcel.writeInt(duration)
        parcel.writeInt(discount)
        parcel.writeString(startingLocation)
        parcel.writeTypedList(whatsIncluded)
        parcel.writeStringList(locations)
        parcel.writeStringList(subLocations)
        parcel.writeStringList(categories)
        parcel.writeStringList(activities)
        parcel.writeStringList(photos)
        parcel.writeTypedList(itinerary)
        parcel.writeString(thumbnail)
        parcel.writeString(cancellationPolicy)
        parcel.writeString(eventType)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Trip> {
        override fun createFromParcel(parcel: Parcel): Trip {
            return Trip(parcel)
        }

        override fun newArray(size: Int): Array<Trip?> {
            return arrayOfNulls(size)
        }
    }
}