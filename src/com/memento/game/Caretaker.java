package com.memento.game;

import java.util.List;
import java.util.Map;

/**
 * @Author rc
 * @Date 2022/8/17 22:07
 * @Version 1.0
 */

public class Caretaker {
    private Memento memento;
    private List<Memento> mementoList;
    private Map<String, List<Memento>> stringListMap;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
