package com.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author rc
 * @Date 2022/8/10 22:31
 * @Version 1.0
 */

public class ObjectStructure {
    private List<Person> personList = new LinkedList<>();

    public void attach(Person person) {
        personList.add(person);
    }

    public void detach(Person person) {
        personList.remove(person);
    }

    public void disPlay(Action action) {

        for (Person p : personList) {
            p.accept(action);
        }
    }
}
