package org.example;
import java.util.ArrayList;
import java.util.List;
import org.example.Exception.*;

import org.example.interfaces.IWorker;

class CustomerSupport extends Person implements IWorker {
    private double hourlyRate;

    public CustomerSupport(String name, int age, double hourlyRate) throws InvalidAgeException {
        super(name, age);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * 40 * 52;
    }
}