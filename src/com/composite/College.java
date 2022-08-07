package com.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 86176
 */
public class College extends OrganizationComponent {

    List<OrganizationComponent> components = new ArrayList();

    @Override
    protected void print() {
        System.out.println(getName());
        for (int i = 0; i < components.size(); i++) {
            components.get(i).print();
        }
    }

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    protected void remove(OrganizationComponent component) {
        components.remove(component);
    }
}
