package com.singleton.type01;

/**
 * 饿汉式
 */
public class Singleton01 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton==singleton1);
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}


class Singleton {

    private Singleton() {
    }

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}

