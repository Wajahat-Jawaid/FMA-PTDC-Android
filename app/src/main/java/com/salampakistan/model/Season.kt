package com.salampakistan.model

import android.graphics.drawable.Drawable
import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
data class Season(val img: Drawable?, val title: String, val desc: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        null,
        parcel.readString()!!,
        parcel.readString()!!
    )

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(title)
        dest?.writeString(desc)
    }

    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<Season> {
        override fun createFromParcel(parcel: Parcel): Season {
            return Season(parcel)
        }

        override fun newArray(size: Int): Array<Season?> {
            return arrayOfNulls(size)
        }
    }

}