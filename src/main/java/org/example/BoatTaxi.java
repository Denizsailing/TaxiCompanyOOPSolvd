package org.example;

class BoatTaxi extends TaxiCar implements EnvironmentFriendly {
    private String ecoCertification;

    public BoatTaxi(String model, int passengers, double fare, String ecoCertification) {
        super(model, passengers, fare);
        this.ecoCertification = ecoCertification;
    }

    @Override
    public double calculateFare(int distance) {
        return fare * distance * 1.3;
    }

    @Override
    public String getEcoCertification() {
        return ecoCertification;
    }

    @Override
    public void setEcoCertification(String ecoCertification) {
        this.ecoCertification = ecoCertification;
    }
}