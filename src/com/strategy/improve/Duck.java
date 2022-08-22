package com.strategy.improve;

/**
 * @Author rc
 * @Date 2022/8/22 22:15
 * @Version 1.0
 */

public abstract class Duck {

    public FlyBehavior flyBehavior;

    public Duck() {
    }

    public void quack() {
        System.out.println("嘎嘎嘎");
    }

    public void swim() {
        System.out.println("游泳");
    }

    public void fly() {
        if (null != flyBehavior) {
            flyBehavior.fly();
        }
    }

    abstract void disPlay();
}
