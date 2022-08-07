package com.proxy.cglibproxy;

/**
 * @author 86176
 */
public class Client {
    public static void main(String[] args) {

        ProxyFactory proxyFactory = new ProxyFactory(new TeacherDao());

        TeacherDao factoryProxyInstance = (TeacherDao) proxyFactory.getProxyInstance();
        factoryProxyInstance.teach();
    }
}
