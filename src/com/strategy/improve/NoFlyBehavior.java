package com.strategy.improve;

/**
 * @Author rc
 * @Date 2022/8/22 23:04
 * @Version 1.0
 */

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
