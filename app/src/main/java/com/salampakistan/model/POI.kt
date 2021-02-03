package com.salampakistan.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.salampakistan.network.JSONKeys

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
data class POI(
    @SerializedName(JSONKeys._id) val id: String,
    val name: String,
    val iconName: String,
    val typeKey: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    )

    override fun writeToParcel(dest: Parcel?, p1: Int) {
        dest?.writeString(id)
        dest?.writeString(name)
        dest?.writeString(iconName)
        dest?.writeString(typeKey)
    }

    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<POI> {
        override fun createFromParcel(parcel: Parcel): POI {
            return POI(parcel)
        }

        override fun newArray(size: Int): Array<POI?> {
            return arrayOfNulls(size)
        }
    }
}