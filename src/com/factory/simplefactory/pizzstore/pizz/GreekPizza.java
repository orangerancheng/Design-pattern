package com.factory.simplefactory.pizzstore.pizz;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("GreekPizza");
        System.out.println(name + " preparing;");
    }
}
