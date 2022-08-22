package com.strategy.improve;


/**
 * @Author rc
 * @Date 2022/8/22 22:18
 * @Version 1.0
 */

public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void disPlay() {
        System.out.println("野鸭");
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }
}
