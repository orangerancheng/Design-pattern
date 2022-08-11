package com.iterator;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Iterator;

/**
 * @Author rc
 * @Date 2022/8/11 21:27
 * @Version 1.0
 */

public class ComputerCollegeIterator implements Iterator {
    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {
    }
}
