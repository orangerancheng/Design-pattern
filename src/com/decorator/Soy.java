package com.decorator;

public class Soy extends Decorate {
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.50f);
    }
}
