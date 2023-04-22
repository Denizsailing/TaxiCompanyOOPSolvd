package org.example;

class MinivanTaxi extends TaxiCar implements FamilyFriendly {
    private int maxChildSeats;

    public MinivanTaxi(String model, int passengers, double fare, int maxChildSeats) {
        super(model, passengers, fare);
        this.maxChildSeats = maxChildSeats;
    }

    @Override
    public double calculateFare(int distance) {
        return fare * distance * 1.2;
    }

    @Override
    public int getMaxChildSeats() {
        return maxChildSeats;
    }

    @Override
    public void setMaxChildSeats(int maxChildSeats) {
        this.maxChildSeats = maxChildSeats;
    }
}