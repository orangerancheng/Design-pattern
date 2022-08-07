package com.bridge;


public class Vivo implements Brand{
    @Override
    public void close() {
        System.out.println("v");
    }

    @Override
    public void open() {
        System.out.println("V");
    }

    @Override
    public void call() {
        System.out.println("V");
    }
}
