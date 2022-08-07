package com.templatepattern;

/**
 * @author 86176
 */
public abstract class SoyaMilk {

    public final void make() {
        System.out.println("做");
    }

    void select() {
        System.out.println("1");
    }

    abstract void add();

    void soak() {
        System.out.println("3");
    }

    void beat() {
        System.out.println("4");
    }
}
