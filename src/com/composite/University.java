package com.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 86176
 */
public class University extends OrganizationComponent {


    List<OrganizationComponent> components = new ArrayList();

    public University(String name, String des) {
        super(name, des);
    }

    public University() {
    }

    @Override
    protected void print() {
        System.out.println(getName());
        for (int i = 0; i < components.size(); i++) {
          components.get(i).print();
        }
    }

    @Override
    protected void add(OrganizationComponent component) {
        component.add(component);
    }

    @Override
    protected void remove(OrganizationComponent component) {
        component.remove(component);
    }

    public List<OrganizationComponent> getComponents() {
        return components;
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
