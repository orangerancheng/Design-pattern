package com.factory.absfactory.pizzstore.orderpizza;

import com.factory.absfactory.pizzstore.pizza.Pizza;

/**
 * @author 抽象工厂模式
 */
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
