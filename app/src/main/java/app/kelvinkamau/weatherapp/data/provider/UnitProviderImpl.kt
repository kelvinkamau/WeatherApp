package app.kelvinkamau.weatherapp.data.provider

import android.content.Context
import app.kelvinkamau.weatherapp.internal.UnitSystem

class UnitProviderImpl(context: Context) : PreferenceProvider(context), UnitProvider {

    override fun getUnitSystem(): UnitSystem {
        val selectedName = preferences.getString("UNIT_SYSTEM", UnitSystem.METRIC.name)
        return UnitSystem.valueOf(selectedName!!)

    }
}