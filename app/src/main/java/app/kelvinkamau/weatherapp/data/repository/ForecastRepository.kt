package app.kelvinkamau.weatherapp.data.repository

import androidx.lifecycle.LiveData
import app.kelvinkamau.weatherapp.data.db.entity.WeatherLocation
import app.kelvinkamau.weatherapp.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean):LiveData<out UnitSpecificCurrentWeatherEntry>
    suspend fun getWeatherLocation(): LiveData<WeatherLocation>
}