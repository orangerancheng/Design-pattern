package com.observer;

/**
 * @Author rc
 * @Date 2022/8/14 11:19
 * @Version 1.0
 */

public class CurrentConditions implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        disPlay();

    }

    public void disPlay() {
        System.out.println(temperature);
        System.out.println(pressure);
        System.out.println(humidity);
    }
}
