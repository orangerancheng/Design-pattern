package com.decorator;

/**
 * @author 86176
 */
public class Clinet {
    public static void main(String[] args) {

        Drink order = new LongBlack();
//        System.out.println(order.getDes()+":"+order.cost());

        order = new Milk(order);
//        System.out.println(order.getDes()+":"+order.cost());

         order = new Chocolate(order);

        System.out.println(order.getDes());
        System.out.println(order.cost());
    }
}
