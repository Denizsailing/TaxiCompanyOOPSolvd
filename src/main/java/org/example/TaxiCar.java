package org.example;

abstract class TaxiCar {
    protected String model;
    protected int passengers;
    protected double fare;

    public TaxiCar(String model, int passengers, double fare) {
        this.model = model;
        this.passengers = passengers;
        this.fare = fare;
    }

    public abstract double calculateFare(int distance);

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "TaxiCar [model=" + model + ", passengers=" + passengers + ", fare=" + fare + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(fare);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + passengers;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TaxiCar other = (TaxiCar) obj;
        if (Double.doubleToLongBits(fare) != Double.doubleToLongBits(other.fare)) {
            return false;
        }
        if (model == null) {
            if (other.model != null) {
                return false;
            }
        } else if (!model.equals(other.model)) {
            return false;
        }
        if (passengers != other.passengers) {
            return false;
        }
        return true;
    }
}