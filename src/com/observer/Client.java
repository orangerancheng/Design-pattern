package com.observer;

/**
 * @Author rc
 * @Date 2022/8/14 22:21
 * @Version 1.0
 */

public class Client {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditions conditions = new CurrentConditions();
        weatherData.registerObserver(conditions);
        weatherData.setHumidity(11.0f);
        weatherData.setPressure(2.01f);
        weatherData.setTemperature(11.0f);
        weatherData.notifyObserver();
    }
}
