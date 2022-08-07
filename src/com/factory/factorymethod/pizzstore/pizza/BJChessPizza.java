package com.factory.factorymethod.pizzstore.pizza;

public class BJChessPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京的奶酪披萨");
        System.out.println("北京的奶酪披萨准备原材料");
    }
}
