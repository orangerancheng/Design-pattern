package com.composite;

/**
 * @author 86176
 */
public class Department extends OrganizationComponent {
    @Override
    protected void print() {
        System.out.println(getName());
    }

    public Department(String name, String des) {
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
}
