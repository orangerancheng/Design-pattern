package com.memento.game;

/**
 * @Author rc
 * @Date 2022/8/17 22:16
 * @Version 1.0
 */

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole(100, 100);
        gameRole.disPlay();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());
        gameRole.setDef(50);
        gameRole.setVit(50);
        gameRole.disPlay();

        gameRole.recoverGameRoleForMemento(caretaker.getMemento());
        gameRole.disPlay();
    }
}
