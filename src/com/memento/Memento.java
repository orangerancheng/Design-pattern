package com.memento;

/**
 * @Author rc
 * @Date 2022/8/16 22:32
 * @Version 1.0
 */

public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
