package com.olivejua.math;

public class ConvertTheTemperature {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        kelvin = roundToFiveDecimalPlaces(kelvin);
        fahrenheit = roundToFiveDecimalPlaces(fahrenheit);

        return new double[] {kelvin, fahrenheit};
    }

    private double roundToFiveDecimalPlaces(double value) {
        return Math.round(value * 100000.0) / 100000.0;
    }
}
