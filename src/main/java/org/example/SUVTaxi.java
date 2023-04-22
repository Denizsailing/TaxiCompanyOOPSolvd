package org.example;

class SUVTaxi extends TaxiCar implements FamilyFriendly {
    private int maxChildSeats;

    public SUVTaxi(String model, int passengers, double fare, int maxChildSeats) {
        super(model, passengers, fare);
        this.maxChildSeats = maxChildSeats;
    }

    @Override
    public double calculateFare(int distance) {
        return fare * distance * 1.4;
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
