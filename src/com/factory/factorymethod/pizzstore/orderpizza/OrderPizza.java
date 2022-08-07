package com.factory.factorymethod.pizzstore.orderpizza;

import com.factory.simplefactory.pizzstore.pizz.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = gettype();
            createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    abstract com.factory.factorymethod.pizzstore.pizza.Pizza createPizza(String type);
}
