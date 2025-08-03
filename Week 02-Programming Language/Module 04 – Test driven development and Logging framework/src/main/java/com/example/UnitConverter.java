package com.example;

public class UnitConverter {
    public double celsiusToFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32;
    }

    public double metersToKilometers(double m) {
        return m / 1000.0;
    }

    public double kgToPounds(double kg) {
        return kg * 2.20462;
    }
}
