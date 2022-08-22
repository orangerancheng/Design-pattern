package com.strategy.improve;


/**
 * @Author rc
 * @Date 2022/8/22 22:19
 * @Version 1.0
 */

public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void disPlay() {
        System.out.println("北京鸭");
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }
}
