package org.example;

class FinancialWorker extends Person implements Worker {
    private double yearlySalary;

    public FinancialWorker(String name, int age, double yearlySalary) {
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
