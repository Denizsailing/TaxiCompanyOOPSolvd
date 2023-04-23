package org.example;

final class CustomerRequest {
    private static int requestCount;

    static {
        requestCount = 0;
    }

    private final PersonCustomer customer;

    public CustomerRequest(PersonCustomer customer) {
        this.customer = customer;
        requestCount++;
    }

    public static int getRequestCount() {
        return requestCount;
    }

    public PersonCustomer getCustomer() {
        return customer;
    }
}