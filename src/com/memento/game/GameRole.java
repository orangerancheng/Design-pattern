package com.memento.game;

/**
 * @Author rc
 * @Date 2022/8/17 22:10
 * @Version 1.0
 */

public class GameRole {
    private int vit;
    private int def;

    public GameRole(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public Memento createMemento() {
        return new Memento(vit, def);
    }

    public void recoverGameRoleForMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }
    public void disPlay(){
        System.out.println(this.vit);
        System.out.println(this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
