package com.facade;

/**
 * @author 86176
 */
public class Popcorn {
    private Popcorn() {

    }

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" pop on");
    }

    public void off() {
        System.out.println("pop off");
    }

    public void pop() {
        System.out.println("pop play");
    }

}
