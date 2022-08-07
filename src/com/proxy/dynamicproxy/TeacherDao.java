package com.proxy.dynamicproxy;


/**
 * @author 86176
 */
public class TeacherDao implements IIecaherDao {
    @Override
    public void teach() {
        System.out.println("teacher");
    }

    @Override
    public Integer age() {
        return 12;
    }
}
