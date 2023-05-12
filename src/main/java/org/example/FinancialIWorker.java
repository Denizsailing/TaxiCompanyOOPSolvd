package org.example;
import java.util.ArrayList;
import java.util.List;
import org.example.Exception.*;

import org.example.interfaces.IWorker;

class FinancialIWorker extends Person implements IWorker {
    private double yearlySalary;

    public FinancialIWorker(String name, int age, double yearlySalary) throws InvalidAgeException {
        super(name, age);
        this.yearlySalary = yearlySalary;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    @Override
    public double calculateSalary() {
        return yearlySalary;
    }

}

