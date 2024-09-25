package org.example.openweather.Service;

import org.example.openweather.dto.WeatherResponse;
import org.example.openweather.model.Output;

public interface weatherService {
    public Output getWeather(double lat, double lon);
}
