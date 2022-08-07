package com.adapter.objectadapter;

public class VoltageAdaper implements Voltage5V {

    private Voltage220V voltage220V;

    public VoltageAdaper(Voltage220V out220v) {
        this.voltage220V = out220v;
    }

    public VoltageAdaper() {
    }

    @Override
    public int output5V() {
        int dstv = 0;
        if (null != voltage220V) {
            int out220v = voltage220V.out220v();
            System.out.println("转换啦");
            dstv = out220v / 44;
        }

        return dstv;
    }
}
