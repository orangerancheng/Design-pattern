package com.bridge;

public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    public void close() {
        brand.close();
    }

    public void open() {
        brand.open();
    }

    public void call() {
        brand.call();
    }
}
