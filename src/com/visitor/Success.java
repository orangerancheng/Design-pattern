package com.visitor;

/**
 * @Author rc
 * @Date 2022/8/10 22:21
 * @Version 1.0
 */

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("man-success");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("woman-success");
    }
}
