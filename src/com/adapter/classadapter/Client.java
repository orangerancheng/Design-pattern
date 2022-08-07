package com.adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        com.adapter.classadapter.Phone phone = new com.adapter.classadapter.Phone();
        phone.charging(new VoltageAdaper());
    }
}
