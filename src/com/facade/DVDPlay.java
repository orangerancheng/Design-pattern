package com.facade;

public class DVDPlay {
    private DVDPlay() {
    }

    private static DVDPlay instance = new DVDPlay();

    public static DVDPlay getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" dvd on");
    }

    public void off() {
        System.out.println(" dvd off");
    }

    public void play() {
        System.out.println(" dvd play");
    }

    public void pause() {
        System.out.println("dvd pause");
    }
}
