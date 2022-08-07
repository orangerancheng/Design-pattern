package com.decorator;

/**
 * @author 86176
 */
public class Chocolate extends Decorate {

    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3.00f);
    }
}
