package com.prototype.improv;

import javax.xml.transform.Source;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // new 多只羊
        Sheep sheep = new Sheep("1", 11, "2");

        sheep.tom= new Sheep("2",2,"4");
        Sheep clone = (Sheep) sheep.clone();
        System.out.println(clone);
        System.out.println(sheep.hashCode());
        System.out.println("sheep" +sheep.tom.hashCode());
        System.out.println(clone.hashCode());

        System.out.println("clone"+ clone.tom.hashCode());
        System.out.println("====="+ (clone.tom.hashCode()== sheep.tom.hashCode()));
        System.out.println(sheep == clone);
    }
}
