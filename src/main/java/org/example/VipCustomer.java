package org.example;

class VipCustomer extends PersonCustomer {
    protected static final double DISCOUNT_RATE = 0.2;

    public VipCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    protected double getDiscount() {
        return DISCOUNT_RATE;
    }
    @Override
    public void handleCustomerRequest() {
        System.out.println("VipCustomer " + name + " is handling a customer request.");
    }
}

