package app.kelvinkamau.weatherapp.data.provider

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import app.kelvinkamau.weatherapp.internal.UnitSystem

class UnitProviderImpl(context: Context) : UnitProvider {

    private val appContext = context.applicationContext
    private val preferences: SharedPreferences
        get() = PreferenceManager.getDefaultSharedPreferences(appContext)

    override fun getUnitSystem(): UnitSystem {
        val selectedName = preferences.getString("UNIT_SYSTEM", UnitSystem.METRIC.name)
        return UnitSystem.valueOf(selectedName!!)

    }
}