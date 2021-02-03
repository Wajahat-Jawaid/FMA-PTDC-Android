package com.salampakistan.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.salampakistan.network.JSONKeys

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
data class Activity(
    @SerializedName(JSONKeys._id) val id: String,
    val name: String,
    val description: String,
    val thumbnail: String
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    )

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(id)
        dest?.writeString(name)
        dest?.writeString(description)
        dest?.writeString(thumbnail)
    }

    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<Activity> {
        override fun createFromParcel(parcel: Parcel): Activity {
            return Activity(parcel)
        }

        override fun newArray(size: Int): Array<Activity?> {
            return arrayOfNulls(size)
        }
    }
}