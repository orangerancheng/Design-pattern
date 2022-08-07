package com.facade;

/**
 * @author 86176
 */
public class Projector {
    private Projector() {

    }

    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" pro on");
    }

    public void off() {
        System.out.println("pro off");
    }

    public void fouces() {
        System.out.println("pro play");
    }

}
