package org.example;

import org.example.interfaces.IWorker;
import org.example.Exception.*;
class NormalIWorker extends Person implements IWorker {
    private double hourlyRate;

    public NormalIWorker(String name, int age, double hourlyRate) throws InvalidAgeException {
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