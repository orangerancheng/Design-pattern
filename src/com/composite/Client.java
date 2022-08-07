package com.composite;

public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华", "1");

        OrganizationComponent college = new College("计算机", "妓院");

        OrganizationComponent college1 = new College("信息", "信息");


        college.add(new Department("软件", "软件"));
        college.add(new Department("网络工程", "网络"));

        college1.add(new Department("x", "x"));
        college1.add(new Department("yuwei", "wenwei"));


        university.add(college);
        university.add(college1);

        university.print();
    }
}
