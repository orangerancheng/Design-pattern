package com.strategy.improve;


/**
 * @Author rc
 * @Date 2022/8/22 22:28
 * @Version 1.0
 */

public class ToyDuck extends Duck {
    public ToyDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    void disPlay() {
        System.out.println("玩具鸭");
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }

    @Override
    public void quack() {
        System.out.println("不能叫");
    }

    @Override
    public void swim() {
        System.out.println("不会游泳");
    }
}
