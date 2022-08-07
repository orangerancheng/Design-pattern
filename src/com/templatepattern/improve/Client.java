package com.templatepattern.improve;

/**
 * @Author rc
 * @Date 2022/8/7 14:17
 * @Version 1.0
 */

public class Client {
    public static void main(String[] args) {
        SoyaMilk peanutSoryMilk = new PeanutSoryMilk();
        peanutSoryMilk.make();


        SoyaMilk readBeanSoryMilk=new ReadBeanSoryMilk();
        readBeanSoryMilk.make();

        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
