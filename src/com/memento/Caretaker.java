package com.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author rc
 * @Date 2022/8/16 22:37
 * @Version 1.0
 */

public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
