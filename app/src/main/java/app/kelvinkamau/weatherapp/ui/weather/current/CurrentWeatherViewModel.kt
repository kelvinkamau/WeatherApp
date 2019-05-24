package app.kelvinkamau.weatherapp.ui.weather.current

import androidx.lifecycle.ViewModel;
import app.kelvinkamau.weatherapp.data.repository.ForecastRepository
import app.kelvinkamau.weatherapp.internal.UnitSystem
import app.kelvinkamau.weatherapp.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository
) : ViewModel() {
    private val unitSystem = UnitSystem.METRIC//get from settings

    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }
    // TODO: Implement the ViewModel
}
