package com.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author rc
 * @Date 2022/8/11 21:36
 * @Version 1.0
 */

public class InfoCollegeIterator implements Iterator {
    List<Department> departments;

    int index = -1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    @Override
    public void remove() {

    }
}
