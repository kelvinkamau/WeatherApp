package app.kelvinkamau.weatherapp.data.network

import androidx.lifecycle.LiveData
import app.kelvinkamau.weatherapp.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )
}