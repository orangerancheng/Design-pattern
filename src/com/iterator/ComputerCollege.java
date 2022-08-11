package com.iterator;

import java.util.Iterator;

/**
 * @Author rc
 * @Date 2022/8/11 21:48
 * @Version 1.0
 */

public class ComputerCollege implements College {
    Department[] departments;
    int num = 0;

    public ComputerCollege() {
        this.departments = new Department[5];
        add("1", "1");
        add("2", "2");
    }

    @Override
    public String getName() {
        return "jy";
    }

    @Override
    public void add(String name, String desc) {
        Department department = new Department(name, desc);
        departments[num] = department;
        num++;
    }

    @Override
    public Iterator createIterator() {

        return new ComputerCollegeIterator(departments);
    }
}
