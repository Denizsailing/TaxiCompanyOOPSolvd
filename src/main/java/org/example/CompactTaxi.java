package org.example;

class CompactTaxi extends TaxiCar implements FuelEfficient {
    private double fuelEfficiency;

    public CompactTaxi(String model, int passengers, double fare, double fuelEfficiency) {
        super(model, passengers, fare);
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public double calculateFare(int distance) {
        return fare * distance * 0.9;
    }

    @Override
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }
}
