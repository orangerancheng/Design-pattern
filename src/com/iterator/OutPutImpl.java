package com.iterator;

import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.List;

/**
 * @Author rc
 * @Date 2022/8/11 22:00
 * @Version 1.0
 */

public class OutPutImpl {
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department=(Department) iterator.next();
            System.out.println(department.getName());
        }
    }
    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println(college.getName());
            printDepartment(college.createIterator());
        }
    }

}
