package com.proxy.dynamicproxy;

/**
 * @author 86176
 */
public class Client {
    public static void main(String[] args) {

        IIecaherDao target = new TeacherDao();
        IIecaherDao proxyFactory = (IIecaherDao) new ProxyFactory(target).getProxyInstance();

        System.out.println(proxyFactory.getClass().getClassLoader());
        proxyFactory.teach();
        Integer age = proxyFactory.age();
        System.out.println(age);
    }
}
