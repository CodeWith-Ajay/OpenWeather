package org.example.openweather.model;

import lombok.Data;

@Data
public class Wind {
    private double speed;
    private int deg;
    private double gust;

    // Getters and Setters
}
