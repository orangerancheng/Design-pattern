package com.visitor;

/**
 * @Author rc
 * @Date 2022/8/10 22:19
 * @Version 1.0
 */

public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
