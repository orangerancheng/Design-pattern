package com.singleton.type03;

/**
 * 懒汉式，线程不安全
 */
public class Singleton {
    public static void main(String[] args) {
        Singleton01 singleton01 = Singleton01.getInstance();
        Singleton01 singleton02 = Singleton01.getInstance();
        System.out.println(singleton01==singleton02);
        System.out.println(singleton01.hashCode());
        System.out.println(singleton02.hashCode());
    }
}

class Singleton01 {
    private Singleton01() {
    }

    private static Singleton01 singleton01;

    public static Singleton01 getInstance() {
        if (singleton01 == null) {
            singleton01 = new Singleton01();
        }
        return singleton01;
    }
}