package org.example;

public class Main {
    public static void main(String[] args) {
        RegularCustomer regCustomer = new RegularCustomer("deniz", "deniz@mail.com");
        VipCustomer vipCustomer = new VipCustomer("gunduz", "gunduz@gmail.com");

        regCustomer.addInfo("Regular customer since 2020.");
        vipCustomer.addInfo("VIP customer since 2023.");

        CustomerRequest request1 = new CustomerRequest(regCustomer);
        CustomerRequest request2 = new CustomerRequest(vipCustomer);

        System.out.println(request1.getCustomer());
        System.out.println(request2.getCustomer());

        request1.getCustomer().printInfo();
        request2.getCustomer().printInfo();

        regCustomer.updateInfo("Regular customer since 2017.");
        vipCustomer.updateInfo("VIP customer since 2021.");

        request1.getCustomer().printInfo();
        request2.getCustomer().printInfo();
    }
}
