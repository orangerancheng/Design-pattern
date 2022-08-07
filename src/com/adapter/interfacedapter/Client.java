package com.adapter.interfacedapter;

public class Client {
    public static void main(String[] args) {
        InterfaceAdapter interfaceAdapter = new InterfaceAdapter() {
            @Override
            public void m1() {
                System.out.println("M1");
            }
        };

        interfaceAdapter.m1();

    }
}
