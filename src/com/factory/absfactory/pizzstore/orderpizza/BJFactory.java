package com.factory.absfactory.pizzstore.orderpizza;

import com.factory.absfactory.pizzstore.pizza.BJChessPizza;
import com.factory.absfactory.pizzstore.pizza.BJPepperPizza;
import com.factory.absfactory.pizzstore.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new BJChessPizza();
        } else if (orderType.equals("chesse")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
