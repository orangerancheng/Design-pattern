package com.builde.improve;

public class HouseDirector {
    HouseBuild houseBuild = null;

    public HouseDirector(HouseBuild houseBuild) {
        this.houseBuild = houseBuild;
    }

    public HouseDirector() {
    }

    public void setHouseBuild(HouseBuild houseBuild) {
        this.houseBuild = houseBuild;
    }

    public House constructHouse() {
        houseBuild.bulidBasic();
        houseBuild.builedWall();
        houseBuild.roodef();
        return houseBuild.bulidHouse();
    }
}
