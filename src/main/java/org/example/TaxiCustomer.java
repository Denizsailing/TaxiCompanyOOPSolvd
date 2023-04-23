package org.example;

class TaxiCustomer extends PersonCustomer {
    protected static final double DISCOUNT_RATE = 0.15;

    public TaxiCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    protected double getDiscount() {
        return DISCOUNT_RATE;
    }
}
