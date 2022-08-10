package com.visitor;

/**
 * @Author rc
 * @Date 2022/8/10 22:35
 * @Version 1.0
 */

public class Client {
    public static void main(String[] args) {

        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Woman());
        Success success = new Success();

        Fail fail = new Fail();
        structure.disPlay(success);
        structure.disPlay(fail);
    }
}
