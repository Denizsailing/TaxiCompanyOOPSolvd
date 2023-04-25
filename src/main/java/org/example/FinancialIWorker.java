package org.example;

import org.example.interfaces.IWorker;

class FinancialIWorker extends Person implements IWorker {
    private double yearlySalary;

    public FinancialIWorker(String name, int age, double yearlySalary) {
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
