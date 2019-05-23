package app.kelvinkamau.weatherapp.data.network.response

import app.kelvinkamau.weatherapp.data.db.entity.CurrentWeatherEntry
import app.kelvinkamau.weatherapp.data.db.entity.Location
import com.google.gson.annotations.SerializedName


data class CurrentWeatherResponse(
    val location: Location,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry

)