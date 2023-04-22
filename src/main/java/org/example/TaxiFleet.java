package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TaxiFleet {
    private static final double BASE_FARE = 2.0;

    public static void main(String[] args) {
        CompactTaxi compactTaxi = new CompactTaxi("ww passat", 4, BASE_FARE, 40.0);
        LuxuryTaxi luxuryTaxi = new LuxuryTaxi("Mercedes s ", 4, BASE_FARE, "Champagne Service");
        ElectricTaxi electricTaxi = new ElectricTaxi("Tesla Model x ", 4, BASE_FARE, "Eco-Certified");
        MinivanTaxi minivanTaxi = new MinivanTaxi("ww jetta", 6, BASE_FARE, 3);
        AccessibleTaxi accessibleTaxi = new AccessibleTaxi("Ford Transit", 6, BASE_FARE, true);
        BoatTaxi boatTaxi = new BoatTaxi("tesla model y ", 8, BASE_FARE, "Eco-Certified");
        SUVTaxi suvTaxi = new SUVTaxi("Range Rover", 5, BASE_FARE, 2);
        BusTaxi busTaxi = new BusTaxi("Mercedes Sprinter", 20, BASE_FARE);
        MotorcycleTaxi motorcycleTaxi = new MotorcycleTaxi("yamaha ybr", 2, BASE_FARE);

        List<TaxiCar> taxiFleet = Arrays.asList(compactTaxi, luxuryTaxi, electricTaxi, minivanTaxi, accessibleTaxi, boatTaxi, suvTaxi, busTaxi, motorcycleTaxi);

        for (TaxiCar taxi : taxiFleet) {
            int distance = 10;
            double fare = taxi.calculateFare(distance);
            System.out.println("Taxi Model: " + taxi.getModel() + " - Fare for " + distance + " miles: $" + fare);
        }

        // Update information
        compactTaxi.setPassengers(3);
        luxuryTaxi.setFare(BASE_FARE * 1.5);
        electricTaxi.setEcoCertification("Super Eco-Certified");
        minivanTaxi.setMaxChildSeats(4);
        accessibleTaxi.setWheelchairAccessible(false);
        boatTaxi.setEcoCertification("Super Eco-Certified");
        suvTaxi.setMaxChildSeats(3);
        busTaxi.setPassengers(25);
        motorcycleTaxi.setFare(BASE_FARE * 0.8);

        // Print updated information
        System.out.println("\nUpdated information:");
        for (TaxiCar taxi : taxiFleet) {
            int distance = 10;
            double fare = taxi.calculateFare(distance);
            System.out.println("Taxi Model: " + taxi.getModel() + " - Fare for " + distance + " miles: $" + fare);
        }
    }
}