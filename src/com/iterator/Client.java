package com.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author rc
 * @Date 2022/8/11 22:09
 * @Version 1.0
 */

public class Client {
    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<College>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);
        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();
    }

}
