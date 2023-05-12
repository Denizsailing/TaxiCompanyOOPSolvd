package org.example.Enum;

enum DriverStatus {
    AVAILABLE,
    ON_TRIP,
    UNAVAILABLE;

    private String currentLocation;
    private String destination;

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}