package com.strategy.improve;

/**
 * @Author rc
 * @Date 2022/8/22 23:04
 * @Version 1.0
 */

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞的一般");
    }
}
