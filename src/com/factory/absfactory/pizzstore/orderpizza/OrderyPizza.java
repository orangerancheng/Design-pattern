package com.factory.absfactory.pizzstore.orderpizza;

import com.factory.absfactory.pizzstore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderyPizza {
    AbsFactory absFactory;

    public void setAbsFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        String orderType = "";
        this.absFactory = absFactory;
        do {
            orderType = gettype();
            pizza = absFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.cut();
            } else {
                System.out.println("失败");
                break;
            }
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
}
