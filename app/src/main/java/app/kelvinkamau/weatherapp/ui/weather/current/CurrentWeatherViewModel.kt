package app.kelvinkamau.weatherapp.ui.weather.current

import androidx.lifecycle.ViewModel
import app.kelvinkamau.weatherapp.data.provider.UnitProvider
import app.kelvinkamau.weatherapp.data.repository.ForecastRepository
import app.kelvinkamau.weatherapp.internal.UnitSystem
import app.kelvinkamau.weatherapp.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {
    private val unitSystem = unitProvider.getUnitSystem()

    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }
}
