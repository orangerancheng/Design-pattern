package com.factory.absfactory.pizzstore.pizza;

public class LDChessPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的奶酪披萨");
        System.out.println("伦敦的奶酪披萨准备原材料");
    }
}
