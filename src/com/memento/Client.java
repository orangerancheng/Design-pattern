package com.memento;

/**
 * @Author rc
 * @Date 2022/8/16 22:39
 * @Version 1.0
 */

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("1");
        caretaker.add(originator.saveMemento());
        originator.setState("2");
        caretaker.add(originator.saveMemento());
        originator.setState("4");
        caretaker.add(originator.saveMemento());

        originator.getStateMemento(caretaker.get(0));
    }
}
