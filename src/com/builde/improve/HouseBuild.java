package com.builde.improve;

public abstract class HouseBuild {
    protected House house = new House();

    public abstract void bulidBasic();

    public abstract void builedWall();

    public abstract void roodef();

    public House bulidHouse() {
        return house;
    }
}
