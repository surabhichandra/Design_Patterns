package com.surabhi.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();

        CurrentConditionsDisplay display=new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(28.3f, 65.0f, 1012.1f);
        weatherData.setMeasurements(30.1f, 70.0f, 1009.5f);
    }
}
