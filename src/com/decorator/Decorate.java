package com.decorator;

/**
 * @author 86176
 */
public class Decorate extends Drink {
    private Drink obj;

    @Override
    public float cost() {
        return super.getPrice() + obj.getPrice();
    }

    public Decorate(Drink obj) {
        this.obj = obj;
    }

    @Override
    public String getDes() {
        return super.getDes() + super.getPrice() + "&&" + obj.getDes() + obj.getDes();
    }
}
