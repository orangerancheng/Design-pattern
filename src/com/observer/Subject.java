package com.observer;

/**
 * @Author rc
 * @Date 2022/8/14 11:12
 * @Version 1.0
 */

public interface Subject {
    public void registerObserver(Observer observer);

    public void remove(Observer observer);

    public void notifyObserver();

}
