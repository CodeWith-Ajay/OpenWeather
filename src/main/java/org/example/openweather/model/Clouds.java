package org.example.openweather.model;

import lombok.Data;

@Data
public class Clouds {
    private int all;

    // Getter and Setter
    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }
}
