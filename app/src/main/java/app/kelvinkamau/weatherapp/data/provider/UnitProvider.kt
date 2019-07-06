package app.kelvinkamau.weatherapp.data.provider

import app.kelvinkamau.weatherapp.internal.UnitSystem

interface UnitProvider {

    fun getUnitSystem(): UnitSystem

}
