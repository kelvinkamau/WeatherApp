package app.kelvinkamau.weatherapp.data.db.unitlocalized

interface UnitSpecificCurrentWeatherEntry  {
    val temperature: Double
    val conditionText: String
    val conditionIconUrl: String
    val windSpeed: Double
    val windDirection: String
    val precitipationVolume: Double
    val feelsLikeTemperature: Double
    val visibilityDistance: Double
}