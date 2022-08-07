package com.bridge;

public class XiaoMI implements Brand{
    @Override
    public void close() {
        System.out.println("M");
    }

    @Override
    public void open() {
        System.out.println("M");
    }

    @Override
    public void call() {
        System.out.println("M");
    }
}
