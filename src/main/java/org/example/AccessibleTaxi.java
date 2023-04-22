package org.example;

final class AccessibleTaxi extends TaxiCar implements WheelchairAccessible {
    private boolean wheelchairAccessible;

    public AccessibleTaxi(String model, int passengers, double fare, boolean wheelchairAccessible) {
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