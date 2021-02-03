package com.salampakistan.utils

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.BlendMode
import android.graphics.BlendModeColorFilter
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Build
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.RatingBar
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.salampakistan.R
import com.salampakistan.base.BindableAdapter
import com.salampakistan.model.hotelsearchresponse.Hotel
import com.salampakistan.utils.CalendarUtils.getDates
import com.salampakistan.utils.CalendarUtils.getEventDates
import com.salampakistan.utils.extension.getCommaSeparatedPrice
import com.salampakistan.utils.extension.getParentActivity
import timber.log.Timber
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList


enum class TintDrawableAlignment(internal var positionCode: Int) {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3)
}

/* DataBinding adapters for across the app */
@BindingAdapter("adapter")
fun setAdapter(view: RecyclerView, adapter: RecyclerView.Adapter<*>) {
    view.adapter = adapter
}

@BindingAdapter("items")
fun <T> setRecyclerViewItems(recyclerView: RecyclerView, items: List<T>?) {
    if (recyclerView.adapter is BindableAdapter<*> && items != null) {
        recyclerView.layoutManager = LinearLayoutManager(recyclerView.context)
        @Suppress("UNCHECKED_CAST")
        (recyclerView.adapter as BindableAdapter<T>).setData(items)
    }
}

@BindingAdapter("items")
fun <T> setRecyclerViewItems(recyclerView: RecyclerView, items: ArrayList<T>?) {
    Timber.d("items: %d", items!!.size)
//    if (recyclerView.adapter is BindableAdapter<*> && items != null) {
    recyclerView.layoutManager = LinearLayoutManager(recyclerView.context)
    @Suppress("UNCHECKED_CAST")
    (recyclerView.adapter as BindableAdapter<T>).setData(items)
//    }
}

@BindingAdapter("visibilityGone")
fun setMutableVisibility(view: View, visibility: Boolean) {
    view.visibility = if (visibility) View.VISIBLE else View.GONE
}

@BindingAdapter("mutableVisibility")
fun setMutableVisibility(view: View, visibility: MutableLiveData<Int>?) {
    val parentActivity: AppCompatActivity? = view.getParentActivity()
    if (parentActivity != null && visibility != null) {
        visibility.observe(parentActivity, Observer { value ->
            view.visibility = value ?: View.VISIBLE
        })
    }
}

@BindingAdapter("mutableText")
fun setMutableText(view: TextView, text: MutableLiveData<String>?) {
    val parentActivity: AppCompatActivity? = view.getParentActivity()
    if (parentActivity != null && text != null) {
        text.observe(parentActivity, Observer { value -> view.text = value ?: "" })
    }
}

@BindingAdapter("imageUrl")
fun setImageUrl(view: ImageView, url: String?) {
    Glide.with(view.context)
        .load(url)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .placeholder(R.drawable.ic_placeholder)
        .into(view)

}

@BindingAdapter("imageResourceDrawable")
fun setImageResource(view: ImageView, iconName: String?) {
    view.setImageDrawable(getDrawable(iconName, view.context))
}

fun getDrawable(iconName: String?, context: Context): Drawable? {

    if (iconName.toString().contains("hotel", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_hotel)
    } else if (iconName.toString().contains("elephant", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_park)
    } else if (iconName.toString().contains("surface", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_museum)
    } else if (iconName.toString().contains("Outline", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_food)
    } else if (iconName.toString().contains("home", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_guest_house)
    } else if (iconName.toString().contains("trophy", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_trophy)
    } else if (iconName.toString().contains("amusement", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_park)
    } else if (iconName.toString().contains("hostel", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_hostel)
    } else if (iconName.toString().contains("hospital", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_hospital)
    } else if (iconName.toString().contains("market", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_market)
    } else if (iconName.toString().contains("shop", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_shop)
    } else if (iconName.toString().contains("guide", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_guide)
    } else if (iconName.toString().contains("pharmacy", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_pharmacy)
    } else if (iconName.toString().contains("cafe", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_cafe)
    } else if (iconName.toString().contains("bakery", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_bakery)
    } else if (iconName.toString().contains("airport", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_airport)
    } else if (iconName.toString().contains("church", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_hotel)
    } else if (iconName.toString().contains("accomodation", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_accomodation)
    } else if (iconName.toString().contains("car", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_car)
    } else if (iconName.toString().contains("bus", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_bus)
    } else if (iconName.toString().contains("flight", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_flight)
    } else if (iconName.toString().contains("train", true)) {
        return ContextCompat.getDrawable(context, R.drawable.ic_train)
    } else {
        return ContextCompat.getDrawable(context, R.drawable.ic_park)
    }

}

@BindingAdapter("imageSrc")
fun setImageDrawable(view: ImageView, src: Int?) {
    Glide.with(view.context)
        .load(src)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .placeholder(R.drawable.ic_placeholder)
        .into(view)
}

@BindingAdapter(
    value = ["imageUrlCustomDimensions", "width", "height", "shouldNotUsePlaceholder"],
    requireAll = false
)
fun setImageUrlWithCustomDimensions(
    view: ImageView,
    url: String?,
    width: Float,
    height: Float,
    shouldNotUsePlaceholder: Boolean
) {
    // If width is not provided, then use match_parent width by applying window screen width
    var resolvedWidth = width.toInt()
    val activity = view.getParentActivity()
    if (width == 0f && activity != null) {
        resolvedWidth = DisplayUtils.getScreenWidth(activity)
    }
    Glide.with(view.context)
        .load(url)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .placeholder(if (shouldNotUsePlaceholder) 0 else R.drawable.ic_placeholder)
        .override(resolvedWidth, height.toInt())
        .into(view)
}

@SuppressLint("SetTextI18n")
@BindingAdapter("priceText","currency")
fun setPriceText(view: TextView, price: String, currency: String) {
    val formatter = DecimalFormat("#,###,###")
    view.text = "$currency ${formatter.format(price.toLong())}"
}

/* Text Formatting */
@BindingAdapter("zeroFormattedValue")
fun formatValueWithZero(view: TextView, value: Int) {
    view.text = if (value < 10) "0$value" else value.toString()
}

@BindingAdapter(value = ["drawableAlignment", "drawableTint"])
fun setDrawableTint(textView: TextView, alignment: TintDrawableAlignment, @ColorInt color: Int) {
    val drawable = textView.compoundDrawablesRelative[alignment.positionCode]
    // Get only the drawable of a provided alignment. 0: Left, 1: Top, 2: Right, 3: Bottom
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        drawable.colorFilter = BlendModeColorFilter(color, BlendMode.SRC_ATOP)
    } else {
        drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP)
    }
}

@BindingAdapter("marginStart")
fun setLayoutMarginStart(view: View, dimen: Float) {
    val layoutParams = view.layoutParams as ViewGroup.MarginLayoutParams
    layoutParams.marginStart = dimen.toInt()
    view.layoutParams = layoutParams
}

/* Layout Params */
@BindingAdapter("marginEnd")
fun setLayoutMarginEnd(view: View, dimen: Float) {
    val layoutParams = view.layoutParams as ViewGroup.MarginLayoutParams
    layoutParams.marginEnd = dimen.toInt()
    view.layoutParams = layoutParams
}

@BindingAdapter("marginTop")
fun setLayoutMarginTop(view: View, dimen: Float) {
    val layoutParams = view.layoutParams as ViewGroup.MarginLayoutParams
    layoutParams.topMargin = dimen.toInt()
    view.layoutParams = layoutParams
}

@BindingAdapter("marginBottom")
fun setLayoutMarginBottom(view: View, dimen: Float) {
    val layoutParams = view.layoutParams as ViewGroup.MarginLayoutParams
    layoutParams.bottomMargin = dimen.toInt()
    view.layoutParams = layoutParams
}

@BindingAdapter("setProgress")
fun setRatingBarProgress(view: RatingBar, stars: Int) {
    view.rating = stars.toFloat()
}

@BindingAdapter("setProgressbarProgress")
fun setprogressBarProgress(view: ProgressBar, progress: Int) {
    view.progress = progress
}

@BindingAdapter("setText")
fun getPerNightIntSpannable(view: TextView, amount: Int) {
    val perText = "PKR ${amount.getCommaSeparatedPrice()} per night"
    val spannable = SpannableString(perText)
    spannable.setSpan(RelativeSizeSpan(0.7f), perText.length - 10, perText.length, 0)
    spannable.setSpan(
        ForegroundColorSpan(ContextCompat.getColor(view.context, R.color.black)),
        perText.length - 10,
        perText.length,
        0
    )
    view.text = spannable
}

@BindingAdapter("setPerpersonText")
fun getPerPersonIntSpannable(view: TextView, amount: Int) {
    val perText = "PKR ${amount.getCommaSeparatedPrice()} / person"
    view.text = perText
}

@BindingAdapter("setCityText")
fun setCityState(view: TextView, model: Hotel) {
//    if (!model.hotelInfo.HotelLocation.isNullOrEmpty()) {
//        view.text = "${model.city}, ${model.state}"
//    } else
    view.text = model.hotelInfo.HotelLocation
}

@BindingAdapter("setStartDate", "setEndDate")
fun setDateText(view: TextView, startDate: Long, endDate: Long) {

    val sdf = SimpleDateFormat("dd MMM")
    val startFrom = Date(startDate)
    val endTo = Date(endDate)
    view.text = getEventDates(sdf.format(startFrom), sdf.format(endTo))
}

