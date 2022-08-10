package com.visitor;

/**
 * @Author rc
 * @Date 2022/8/10 22:17
 * @Version 1.0
 */

public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
