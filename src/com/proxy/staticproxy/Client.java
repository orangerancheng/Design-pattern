package com.proxy.staticproxy;

/**
 * @author 86176
 */
public class Client {
    public static void main(String[] args) {
        TeacherDaoProxy proxy = new TeacherDaoProxy(new TeacherDao());
        proxy.teach();
    }
}
