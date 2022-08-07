package com.decorator;

/**
 * @author 86176
 */
public class Coffee extends Drink {
    @Override
    public float cost() {

        return super.getPrice();
    }

}
