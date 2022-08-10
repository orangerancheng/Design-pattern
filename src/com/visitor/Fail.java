package com.visitor;

/**
 * @Author rc
 * @Date 2022/8/10 22:23
 * @Version 1.0
 */

public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("man-fail");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("woman-fail");
    }
}
