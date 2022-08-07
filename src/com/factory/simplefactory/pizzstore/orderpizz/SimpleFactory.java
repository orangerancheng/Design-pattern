package com.factory.simplefactory.pizzstore.orderpizz;

import com.factory.simplefactory.pizzstore.pizz.CheesePizza;
import com.factory.simplefactory.pizzstore.pizz.GreekPizza;
import com.factory.simplefactory.pizzstore.pizz.Pizza;

/**
 * @author 简单工厂类
 */
public class SimpleFactory {

     Pizza pizza = null;

    public  Pizza createPizza(String orderType) {

        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(orderType);
        } else if (orderType.equals("chesse")) {
            pizza = new CheesePizza();
            pizza.setName(orderType);
        };
        return pizza;
    }
}
