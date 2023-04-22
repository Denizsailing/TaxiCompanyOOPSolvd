package org.example;

class MotorcycleTaxi extends TaxiCar {
    public MotorcycleTaxi(String model, int passengers, double fare) {
        super(model, passengers, fare);
    }

    @Override
    public double calculateFare(int distance) {
        return fare * distance * 0.7;
    }
}
