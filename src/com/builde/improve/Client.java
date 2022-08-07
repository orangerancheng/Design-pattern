package com.builde.improve;

public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector(new HighBuild());
        houseDirector.constructHouse();

        HouseDirector houseDirector1 = new HouseDirector();
        houseDirector1.setHouseBuild(new CommonHouse());
        houseDirector1.constructHouse();
    }
}
