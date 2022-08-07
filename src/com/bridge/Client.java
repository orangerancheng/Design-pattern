package com.bridge;

public class Client {
    public static void main(String[] args) {

        Phone foldePhone = new FoldePhone(new Vivo());
        foldePhone.call();

        Phone uprightPhone = new UprightPhone(new XiaoMI());
        uprightPhone.call();
    }
}
