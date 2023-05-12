package org.example;
import java.util.ArrayList;
import java.util.List;
import org.example.Exception.*;



public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) throws InvalidAgeException {
        this.name = name;
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            throw new InvalidAgeException("Age must be between 0 and 120");
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
