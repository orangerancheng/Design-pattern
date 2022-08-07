package com.singleton.type02;

/**
 * 饿汉式
 */
public class Singleton02 {
    public static void main(String[] args) {
        Singleton001 singleton001 = Singleton001.getInstance();
        Singleton001 singleton0011 = Singleton001.getInstance();


        System.out.println(singleton001 == singleton0011);
        System.out.println(singleton001.hashCode());
        System.out.println(singleton0011.hashCode());
    }
}


class Singleton001 {
    private static Singleton001 singleton0011;

    private Singleton001() {
    }

    static {
        singleton0011 = new Singleton001();
    }

    public static Singleton001 getInstance() {
        return singleton0011;
    }
}

