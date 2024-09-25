package org.example.openweather.Controller;

import org.example.openweather.Service.weatherService;
import org.example.openweather.dto.WeatherResponse;
import org.example.openweather.model.Output;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class weatherController {

    @Autowired
    private weatherService weatherService;
    @GetMapping("/weather")
    public ResponseEntity<Output> getWeather(@RequestParam double lat, @RequestParam double lon) {
        Output Data = weatherService.getWeather(lat, lon);
        return ResponseEntity.ok(Data);

    }
}
