package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author rc
 * @Date 2022/8/11 21:57
 * @Version 1.0
 */

public class InfoCollege implements College {
    List<Department> departments;

    public InfoCollege() {
        this.departments = new ArrayList<>();
        add("x1", "x1");
        add("x2", "x2");
    }

    @Override
    public String getName() {
        return "xj";
    }

    @Override
    public void add(String name, String desc) {

        Department department = new Department(name, desc);
        departments.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
