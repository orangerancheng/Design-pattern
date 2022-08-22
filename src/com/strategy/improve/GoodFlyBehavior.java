package com.strategy.improve;

/**
 * @Author rc
 * @Date 2022/8/22 23:03
 * @Version 1.0
 */

public class GoodFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞飞飞");
    }
}
