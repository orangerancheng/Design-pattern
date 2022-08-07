package com.bridge;

public class UprightPhone extends Phone{
    public UprightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void close() {
        super.close();
        System.out.println("UP");
    }

    @Override
    public void open() {
        super.open();
        System.out.println("UP");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("UP");
    }
}
