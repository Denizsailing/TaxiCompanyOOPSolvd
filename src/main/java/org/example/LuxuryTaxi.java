package org.example;

import org.example.interfaces.IPremiumService;

class LuxuryTaxi extends TaxiCar implements IPremiumService {
    private String premiumService;

    public LuxuryTaxi(String model, int passengers, double fare, String premiumService) {
        super(model, passengers, fare);
        this.premiumService = premiumService;
    }

    @Override
    public double calculateFare(int distance) {
        return fare * distance * 1.5;
    }

    @Override
    public String getPremiumService() {
        return premiumService;
    }

    @Override
    public void setPremiumService(String premiumService) {
        this.premiumService = premiumService;
    }
}
