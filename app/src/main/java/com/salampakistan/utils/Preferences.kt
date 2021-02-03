package com.salampakistan.utils

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import android.text.TextUtils
import androidx.annotation.NonNull
import com.google.gson.Gson
import com.salampakistan.model.User
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
class Preferences @Inject constructor(context: Context) {

    private val emptyString = ""

    enum class KEYS(private val text: String) {

        USER("USER"),
        ONBOARDINGSCREEN("ONBOARDINGSCREEN"),
        PROMPT_COUNTER("PROMPT_COUNTER");

        @NonNull
        override fun toString(): String {
            return text
        }
    }

    private val preferences: SharedPreferences =
        PreferenceManager.getDefaultSharedPreferences(context)

    fun insert(key: String, value: String?) {
        if (value != null) {
            val editor = preferences.edit()
            editor.putString(key, value)
            editor.apply()
        }
    }

    fun insert(key: String, value: Int?) {
        if (value != null) {
            val editor = preferences.edit()
            editor.putInt(key, value)
            editor.apply()
        }
    }

    fun insert(key: String, value: Long?) {
        if (value != null) {
            val editor = preferences.edit()
            editor.putLong(key, value)
            editor.apply()
        }
    }

    fun insert(key: String, value: Boolean?) {
        if (value != null) {
            val editor = preferences.edit()
            editor.putBoolean(key, value)
            editor.apply()
        }
    }

    fun saveUser(value: User) {
        val editor = preferences.edit()
        val json = Gson().toJson(value)
        Timber.d("json: %s", json)
        editor.putString(KEYS.USER.toString(), json)
        editor.apply()
    }

    fun setDisplayedOnboarding(value: Boolean) {
        val editor = preferences.edit()
        editor.putBoolean(KEYS.ONBOARDINGSCREEN.toString(), value)
        editor.apply()
    }

    fun getUser(): User? {
        val json = preferences.getString(KEYS.USER.toString(), "")
        if (TextUtils.isEmpty(json))
            return null
        return Gson().fromJson<User>(json, User::class.java)
    }

    fun getString(key: String) = preferences.getString(key, emptyString)!!
    fun getInt(key: String) = preferences.getInt(key, 0)
    fun getLong(key: String) = preferences.getLong(key, 0)
    fun getBool(key: String) = preferences.getBoolean(key, false)
    fun hasDisplayedOnBoarding() =
        preferences.getBoolean(Preferences.KEYS.ONBOARDINGSCREEN.toString(), false)

    fun getIncrementedPromptCounter(): Int {
        val currentCount = getInt(Preferences.KEYS.PROMPT_COUNTER.toString())
        insert(KEYS.PROMPT_COUNTER.toString(), currentCount.inc())
        return currentCount.inc()
    }

    fun has(key: String) = preferences.contains(key)

    fun clear() {
        preferences.edit().clear().apply()
    }

    fun remove(key: String) {
        preferences.edit().remove(key).apply()
    }
}