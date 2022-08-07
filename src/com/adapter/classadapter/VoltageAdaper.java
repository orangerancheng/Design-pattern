package com.adapter.classadapter;

public class VoltageAdaper extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        int out220v = out220v();
        int dstv = out220v / 44;
        return dstv;
    }
}
