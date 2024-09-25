package org.example.openweather.Service;

import org.example.openweather.dto.WeatherResponse;
import org.example.openweather.model.Output;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServiceimpl implements weatherService{

    @Value("${openweather.api.key}")
    private String apiKey;
    @Override
    public Output getWeather(double lat, double lon) {
        RestTemplate restTemplate = new RestTemplate();
        String url=String.format("https://api.openweathermap.org/data/2.5/weather?lat=%f&lon=%f&appid=%s&units=metric", lat, lon, apiKey);
        WeatherResponse weather= restTemplate.getForObject(url, WeatherResponse.class);
        return convertToOutput(weather);
    }
    private Output convertToOutput(WeatherResponse weather) {
        Output output=new Output();
        output.setId(weather.getId());
        output.setName(weather.getName());
        output.setTimezone(weather.getTimezone());
        output.setCod(weather.getCod());
        output.setVisibility(weather.getVisibility());
        output.setDt(weather.getDt());
        return output;
    }
}
