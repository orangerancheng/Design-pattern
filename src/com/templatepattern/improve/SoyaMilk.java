package com.templatepattern.improve;

/**
 * @author 86176
 */
public abstract class SoyaMilk {

    public final void make() {
        select();
        if (customerWantCondiments()) {
            add();
        }
        soak();
        beat();
    }

    private void select() {
        System.out.println("1");
    }

    abstract void add();

    private void soak() {
        System.out.println("3");
    }

    private void beat() {
        System.out.println("4");
    }

    boolean customerWantCondiments() {
        return true;
    }
}
