package com.flyweight;

/**
 * @author 86176
 */
public class ConcreteWebSite extends WebSite {
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    void use(User user) {
        System.out.println("形式:" + type+"用户:"+user.getName());
    }
}
