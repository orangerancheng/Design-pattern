package com.flyweight;

import java.util.HashMap;

/**
 * @author 86176
 */
public class WebSiteFactory {
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    public WebSite getConcreteWebSite(String type) {

        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    public int getWebSiteCount() {
        return pool.size();
    }
}
