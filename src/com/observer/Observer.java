package com.observer;

/**
 * @Author rc
 * @Date 2022/8/14 11:13
 * @Version 1.0
 */

public interface Observer {
    public void update(float temperatrue, float pressure, float humidity);
}
