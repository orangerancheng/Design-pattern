package com.factory.simplefactory.pizzstore.orderpizz;

import com.factory.simplefactory.pizzstore.pizz.CheesePizza;
import com.factory.simplefactory.pizzstore.pizz.GreekPizza;
import com.factory.simplefactory.pizzstore.pizz.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;
//        do {
//            orderType = gettype();
//            pizza.setName(orderType);
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//            } else if (orderType.equals("chesse")) {
//                pizza = new CheesePizza();
//            } else {
//                break;
//            }
//
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

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

    private SimpleFactory simpleFactory;

    private Pizza pizza = null;

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = "";

        this.simpleFactory = simpleFactory;
        do {
            orderType = gettype();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }
}
