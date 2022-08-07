package com.adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdaper(new Voltage220V()));
    }
}
