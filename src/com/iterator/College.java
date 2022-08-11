package com.iterator;

import java.util.Iterator;

/**
 * @Author rc
 * @Date 2022/8/11 21:44
 * @Version 1.0
 */

public interface College {
    public String getName();

    public void add(String name,String desc);

    public Iterator createIterator();
}
