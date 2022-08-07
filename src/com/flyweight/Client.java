package com.flyweight;

/**
 * @author 86176
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite webSite = webSiteFactory.getConcreteWebSite("新闻");
        User user = new User();
        user.setName("小猫");
        webSite.use(user);
        System.out.println(webSiteFactory.getWebSiteCount());
        WebSite webSite1 = webSiteFactory.getConcreteWebSite("新闻");
        System.out.println(webSiteFactory.getWebSiteCount());
    }
}
