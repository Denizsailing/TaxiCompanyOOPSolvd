package org.example;

import org.example.interfaces.ICustomerActions;

abstract class PersonCustomer implements ICustomerActions {
    protected String name;
    protected String email;
    protected String info;

    public PersonCustomer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    protected abstract double getDiscount();

    @Override
    public String toString() {
        return "PersonCustomer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void addInfo(String info) {
        this.info = info;
    }

    @Override
    public void updateInfo(String info) {
        this.info = info;
    }

    @Override
    public void printInfo() {
        System.out.println("Customer info: " + info);
    }
}