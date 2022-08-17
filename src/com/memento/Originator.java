package com.memento;

/**
 * @Author rc
 * @Date 2022/8/16 22:30
 * @Version 1.0
 */

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveMemento() {
        return new Memento(state);
    }

    public void getStateMemento(Memento memento) {
        state = memento.getState();
        System.out.println(state);
    }
}
