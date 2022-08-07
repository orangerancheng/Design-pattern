package com.singleton.type06;

/**
 * @author 静态内部类
 */
public class Singleton {
    public static void main(String[] args) {
        Singleton01 singleton01 = Singleton01.getInstance();
        Singleton01 singleton02 = Singleton01.getInstance();
        System.out.println(singleton01==singleton02);
    }

}

class Singleton01 {

    private Singleton01() {
    }

    private static class SingletonInstance {
        private static final Singleton01 INSTANCE = new Singleton01();
    }

    public static Singleton01 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}