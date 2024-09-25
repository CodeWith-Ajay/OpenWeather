package org.example.openweather.model;

import lombok.Data;

@Data
public class Rain {
    private double oneHour;

    // Getter and Setter
    public double getOneHour() {
        return oneHour;
    }

    public void setOneHour(double oneHour) {
        this.oneHour = oneHour;
    }
}
