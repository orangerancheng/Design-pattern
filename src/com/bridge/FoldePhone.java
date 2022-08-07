package com.bridge;

public class FoldePhone extends Phone {
    public FoldePhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("Z");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("Z");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("Z");
    }
}
