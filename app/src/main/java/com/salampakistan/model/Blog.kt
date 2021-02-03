package com.salampakistan.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.salampakistan.network.JSONKeys

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
data class Blog(
    @SerializedName(JSONKeys._id) val id: String,
    val author: String,
    val date: Long,
    val imagePath: String,
    val slug: String,
    val title: String,
    @SerializedName("featuredTextMobile")
    val featuredText: String,
    val url: String,
    val body: String,
    val isFeatured: Boolean = false,
    @SerializedName("category") val categories: List<String>
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readLong(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readByte() != 0.toByte(),
        parcel.createStringArrayList()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(author)
        parcel.writeLong(date)
        parcel.writeString(imagePath)
        parcel.writeString(slug)
        parcel.writeString(title)
        parcel.writeString(featuredText)
        parcel.writeString(url)
        parcel.writeString(body)
        parcel.writeByte(if (isFeatured) 1 else 0)
        parcel.writeStringList(categories)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Blog> {
        override fun createFromParcel(parcel: Parcel): Blog {
            return Blog(parcel)
        }

        override fun newArray(size: Int): Array<Blog?> {
            return arrayOfNulls(size)
        }
    }
}