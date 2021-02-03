package com.salampakistan.utils.extension

import android.content.Context
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.util.Patterns
import android.view.View
import androidx.core.content.ContextCompat
import com.salampakistan.R
import timber.log.Timber
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
private val monthsArr: List<String> by lazy {
    listOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
}

fun Int.getCommaSeparatedPrice(): String {
    val strPrice = this.toString()
    var formatted = strPrice
    if (strPrice.length > 3) {
        when {
            strPrice.length == 4 -> formatted =
                strPrice.substring(0, 1) + "," + strPrice.substring(1, 4)
            strPrice.length == 5 -> formatted =
                strPrice.substring(0, 2) + "," + strPrice.substring(2, 5)
            strPrice.length == 6 -> formatted =
                strPrice.substring(0, 3) + "," + strPrice.substring(3, 6)
        }
    }
    return "$formatted"
}

fun Float.getFormattedPrice(): String {
    val formatter = DecimalFormat("#,###,###")
    return formatter.format(this)
}

fun Float.getCelsiusTemperature(): SpannableString {
    val text = "$this\u2103"
    val spannable = SpannableString(text)
    spannable.setSpan(RelativeSizeSpan(0.7f), text.length - 1, text.length, 0)
    return spannable
}

fun BigDecimal.getCommaSeparatedPrice(): String {
    var actualPrice = this
    if (this.stripTrailingZeros().scale() <= 0)
        actualPrice = this.setScale(0, RoundingMode.HALF_UP)
    val strPrice = actualPrice.toString()
    var formatted = strPrice
    if (strPrice.length > 3) {
        when {
            strPrice.length == 4 -> formatted =
                strPrice.substring(0, 1) + "," + strPrice.substring(1, 4)
            strPrice.length == 5 -> formatted =
                strPrice.substring(0, 2) + "," + strPrice.substring(2, 5)
            strPrice.length == 6 -> formatted =
                strPrice.substring(0, 3) + "," + strPrice.substring(3, 6)
        }
    }
    return "Rs. $formatted"
}


fun getPerPersonSpannable(context: Context, price: BigDecimal): SpannableString {
    val perText = "PKR ${price.getCommaSeparatedPrice()}"
    val spannable = SpannableString(perText)
    spannable.setSpan(RelativeSizeSpan(0.6f), perText.length - 10, perText.length, 0)
    spannable.setSpan(
        ForegroundColorSpan(ContextCompat.getColor(context, R.color.black)),
        perText.length - 10,
        perText.length,
        0
    )
    return spannable
}

fun Long.toDate(): String {
    val format = SimpleDateFormat("dd-MMM-YYYY", Locale.getDefault())
    return format.format(this)
}

fun Long.toBookingDate(): String {
    val format = SimpleDateFormat("YYYY-MM-dd", Locale.getDefault())
    return format.format(this)
}

fun Int.getFormattedSingleDigit(): String {
    return if (this >= 10) this.toString() else "0$this"
}

fun CharSequence.isValidEmail() =
    !isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()

fun Int.getMonthInWords(month: Int) = monthsArr[month]

fun Long.getDayOfMonthFromDate(): String {
    val format = SimpleDateFormat("dd-MMM", Locale.getDefault())
    val strDate = format.format(this)
    val day = strDate.substringBefore("-")
    Timber.d("day: %s", day)
    return day
}

fun Long.getDayFromDate(): String {
    val sdf = SimpleDateFormat("EEEE", Locale.getDefault())
    val d = Date(this)
    return sdf.format(d)
}

fun Long.getMonthFromDate(): String {
    val format = SimpleDateFormat("dd-MMM", Locale.getDefault())
    val strDate = format.format(this)
    val month = strDate.substringAfter("-")
    Timber.d("month: %s", month)
    return month
}
