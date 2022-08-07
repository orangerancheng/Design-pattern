package com.factory.factorymethod.pizzstore.orderpizza;

import com.factory.factorymethod.pizzstore.pizza.BJChessPizza;
import com.factory.factorymethod.pizzstore.pizza.BJPepperPizza;
import com.factory.factorymethod.pizzstore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("greek")) {
            pizza = new BJChessPizza();
        } else if (type.equals("chesse")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
