package com.adapter.objectadapter;

public class Phone {
    public void charging(Voltage5V voltage5V) {
        if (voltage5V.output5V() == 5) {
            System.out.println("可以充电");
        } else {
            System.out.println("不可以充电");
        }
    }
}
