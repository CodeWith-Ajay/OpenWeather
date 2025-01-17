package org.example.openweather.dto;

import lombok.Data;
import org.example.openweather.model.*;

import java.util.List;

@Data
public class WeatherResponse {
    private Coord coord;
    private List<Weather> weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private Rain rain;
    private Clouds clouds;
    private long dt;
    private Sys sys;
    private int timezone;
    private long id;
    private String name;
    private int cod;

    // Getters and Setters
}
