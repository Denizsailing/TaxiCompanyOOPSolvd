package org.example.Enum;

enum TaxiType {
    SEDAN,
    SUV,
    VAN;

    private int maxPassengerCount;

    public int getMaxPassengerCount() {
        return maxPassengerCount;
    }

    public void setMaxPassengerCount(int maxPassengerCount) {
        this.maxPassengerCount = maxPassengerCount;
    }
}