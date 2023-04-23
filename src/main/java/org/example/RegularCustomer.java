package org.example;

class RegularCustomer extends PersonCustomer {
    protected static final double DISCOUNT_RATE = 0.1;

    public RegularCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    protected double getDiscount() {
        return DISCOUNT_RATE;
    }
}