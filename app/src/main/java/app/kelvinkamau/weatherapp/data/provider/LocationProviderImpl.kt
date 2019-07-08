package app.kelvinkamau.weatherapp.data.provider

import app.kelvinkamau.weatherapp.data.db.entity.WeatherLocation

class LocationProviderImpl : LocationProvider {
    override suspend fun hasLocationChanged(lastWeatherLocation: WeatherLocation): Boolean {
        return true
    }

    override suspend fun getPreferredLocationString(): String {
        return "Nairobi"
    }
}