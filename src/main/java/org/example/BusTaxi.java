package org.example;

class BusTaxi extends TaxiCar {
    public BusTaxi(String model, int passengers, double fare) {
        super(model, passengers, fare);
    }

    @Override
    public double calculateFare(int distance) {
        return fare * distance * 0.6;
    }
}