package com.decorator;

public class Milk extends Decorate {
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.00f);
    }
}
