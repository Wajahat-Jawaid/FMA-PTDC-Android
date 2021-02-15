package com.salampakistan.model.tripslist

import android.os.Parcel
import android.os.Parcelable

data class Trip(
    val _id: String,
    val activities: String,
    val averageRating: Int,
    val cancellationPolicy: String,
    val categories: String,
    val date: Long,
    val description: String,
    val duration: Int,
    val facilities: String,
    val isFeatured: Boolean,
    val itinerary: List<Itinerary>,
    val locations: String,
    val price: Int,
    val slug: String,
    val status: String,
    val thumbnails: List<String>,
    val title: String,
    val totalRating: Int,
    val totalReviews: Int,
    val vendor: String
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readLong(),
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readByte() != 0.toByte(),
        parcel.createTypedArrayList(Itinerary)!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.createStringArrayList()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(_id)
        parcel.writeString(activities)
        parcel.writeInt(averageRating)
        parcel.writeString(cancellationPolicy)
        parcel.writeString(categories)
        parcel.writeLong(date)
        parcel.writeString(description)
        parcel.writeInt(duration)
        parcel.writeString(facilities)
        parcel.writeByte(if (isFeatured) 1 else 0)
        parcel.writeTypedList(itinerary)
        parcel.writeString(locations)
        parcel.writeInt(price)
        parcel.writeString(slug)
        parcel.writeString(status)
        parcel.writeStringList(thumbnails)
        parcel.writeString(title)
        parcel.writeInt(totalRating)
        parcel.writeInt(totalReviews)
        parcel.writeString(vendor)
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