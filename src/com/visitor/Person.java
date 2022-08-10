package com.visitor;

/**
 * @Author rc
 * @Date 2022/8/10 22:20
 * @Version 1.0
 */

public abstract class Person {

    /**
     * fetch data by rule id
     *
     * @return Result<XxxxDO>
     */
    public abstract void accept(Action action);
}
