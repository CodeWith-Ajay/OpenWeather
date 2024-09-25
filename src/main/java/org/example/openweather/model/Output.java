package org.example.openweather.model;

import lombok.Data;

@Data
public class Output {
    private int visibility;
    private long dt;
    private int timezone;
    private long id;
    private String name;
    private int cod;
}
