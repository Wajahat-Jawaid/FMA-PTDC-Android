package com.salampakistan.utils

import android.app.DatePickerDialog
import android.content.Context
import com.salampakistan.utils.extension.getFormattedSingleDigit
import org.joda.time.DateTime
import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.abs

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
object CalendarUtils {

    private val monthsArr: List<String> by lazy {
        listOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
    }

    fun getLongToDate(date: Long): String? {
        val format = SimpleDateFormat("dd-MMM", Locale.getDefault())
        return format.format(date)
    }

    fun getLongToServerFormattedDate(date: Long): String? {
        val format = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        return format.format(date)
    }

    fun getFormattedDate(year: Int, month: Int, dayOfMonth: Int) =
        "${monthsArr[month]}/${dayOfMonth.getFormattedSingleDigit()}/$year"

    fun getHotelSearchFormattedDate(year: Int, month: Int, dayOfMonth: Int) =
        "${dayOfMonth.getFormattedSingleDigit()} ${monthsArr[month]}"

    fun getBusSearchFormattedDate(year: Int, month: Int, dayOfMonth: Int) =
        "${dayOfMonth.getFormattedSingleDigit()} ${monthsArr[month]} $year"

    fun getFormattedServerDate(year: Int, month: Int, dayOfMonth: Int) =
        "$year-${month.getFormattedSingleDigit()}-${dayOfMonth.getFormattedSingleDigit()}"

    fun getDates(startDate: String, endDate: String): String {
        val splitStartDate = startDate.split("-")
        val splitEndDate = endDate.split("-")
        return if (splitStartDate[1] == splitEndDate[1])
            "${splitStartDate[2]} - ${splitEndDate[2]} ${monthsArr[splitEndDate[1].toInt() - 1]}"
        else "${splitStartDate[2]} ${monthsArr[splitStartDate[1].toInt() - 1]} - ${splitEndDate[2]} ${monthsArr[splitEndDate[1].toInt() - 1]}"
    }

    fun getEventDates(startDate: String, endDate: String): String {
        val splitStartDate = startDate.split(" ")
        val splitEndDate = endDate.split(" ")
        return if (splitStartDate[1] == splitEndDate[1])
            "${splitStartDate[0]} - ${splitEndDate[0]} ${splitEndDate[1]}"
        else "${splitStartDate[0]} ${splitStartDate[1]} - ${splitEndDate[0]} ${splitEndDate[1]}"
    }

    fun showDatePicker(
        context: Context, listener: DatePickerDialog.OnDateSetListener,
        minDate: Long = -1, maxDate: Long = -1
    ) {
        val calendar = Calendar.getInstance()
        val datePickerDialog = DatePickerDialog(
            context,
            listener,
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )
        Timber.d("minDate: %d", minDate)
        datePickerDialog.datePicker.minDate = minDate
        if (maxDate != -1L)
            datePickerDialog.datePicker.maxDate = maxDate
        datePickerDialog.show()
    }

    fun getDaysDifference(startDate: String, endDate: String): Int {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd")
        val stDate = dateFormat.parse(startDate)
        val lastDate = dateFormat.parse(endDate)
        val difference: Long = stDate.time - lastDate.time
        return abs((difference / (1000 * 60 * 60 * 24)).toInt())
    }

    fun convertDate(date: String): String {
        val inputFormat =
            SimpleDateFormat("yyyy-MM-dd")
        val outputFormat = SimpleDateFormat("dd MMM yyyy")

        return outputFormat.format(inputFormat.parse(date))

    }

    fun convertDatetoServerFormat(date: String): String {
        val inputFormat =
            SimpleDateFormat("dd MMM yyyy")
        val outputFormat = SimpleDateFormat("yyyy-MM-dd")

        return outputFormat.format(inputFormat.parse(date))

    }

    fun getMinimumDate(startDate: String?): Long {
        val gc = GregorianCalendar()
        val dateFormat = SimpleDateFormat("yyyy-MM-dd")

        return if (!startDate.isNullOrEmpty()) {
            DateTime(dateFormat.parse(startDate!!)).plusDays(1).millis
        } else System.currentTimeMillis() - 1
    }

    fun getMinimumDateUser(startDate: String?): Long {
        val gc = GregorianCalendar()
        val dateFormat = SimpleDateFormat("dd MMM yyyy")

        return if (!startDate.isNullOrEmpty()) {
            DateTime(dateFormat.parse(startDate!!)).plusDays(1).millis
        } else System.currentTimeMillis() - 1
    }
}