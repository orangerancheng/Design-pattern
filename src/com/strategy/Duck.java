package com.strategy;

/**
 * @Author rc
 * @Date 2022/8/22 22:15
 * @Version 1.0
 */

public abstract class Duck {

    public Duck() {
    }

    public void quack() {
        System.out.println("嘎嘎嘎");
    }

    public void swim() {
        System.out.println("游泳");
    }

    public void fly() {
        System.out.println("飞");
    }

    protected abstract void disPlay();
}
