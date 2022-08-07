package com.facade;

/**
 * @author 86176
 */
public class Client {
    public static void main(String[] args) {

        HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.ready();
    }
}
