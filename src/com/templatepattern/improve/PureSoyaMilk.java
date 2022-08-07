package com.templatepattern.improve;

/**
 * @Author rc
 * @Date 2022/8/7 14:26
 * @Version 1.0
 */

public class PureSoyaMilk extends SoyaMilk {
    @Override
    boolean customerWantCondiments() {
        return false;
    }

    @Override
    void add() {

    }
}
