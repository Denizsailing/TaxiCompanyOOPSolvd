package org.example;
import org.example.Exception.*;
public class Employee extends Person {
    private String company;

    public Employee(String name, int age, String company) throws InvalidAgeException {
        super(name, age);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
