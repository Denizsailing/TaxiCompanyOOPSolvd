package org.example;

import org.example.interfaces.IWheelchairAccessible;

final class AccessibleTaxiI extends TaxiCar implements IWheelchairAccessible {
    private boolean wheelchairAccessible;

    public AccessibleTaxiI(String model, int passengers, double fare, boolean wheelchairAccessible) {
        super(model, passengers, fare);
        this.wheelchairAccessible = wheelchairAccessible;
    }
    @Override
    public double calculateFare(int distance) {
        return fare * distance * 1.1;
    }

    @Override
    public boolean isWheelchairAccessible() {
        return wheelchairAccessible;
    }

    @Override
    public void setWheelchairAccessible(boolean wheelchairAccessible) {
        this.wheelchairAccessible = wheelchairAccessible;
    }
}