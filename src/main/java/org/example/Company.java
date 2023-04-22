package org.example;

import java.util.Arrays;
import java.util.List;

public class Company {
    public static void main(String[] args) {
        Driver driver = new Driver("deniz", 35, 25.0);
        CustomerSupport customerSupport = new CustomerSupport("gunduz", 28, 20.0);
        FinancialWorker financialWorker = new FinancialWorker("oyku", 42, 80000);
        NormalWorker normalWorker = new NormalWorker("jack", 30, 18.0);

        List<Person> employees = Arrays.asList(driver, customerSupport, financialWorker, normalWorker);

        for (Person employee : employees) {
            System.out.println(employee.toString() + ", Salary: $" + ((Worker) employee).calculateSalary());
        }

        // Update information
        driver.setAge(36);
        driver.setHourlyRate(27.0);
        customerSupport.setName("jack sprrow");
        customerSupport.setHourlyRate(21.0);
        financialWorker.setYearlySalary(85000);
        normalWorker.setAge(31);
        normalWorker.setHourlyRate(19.0);

        // Print updated information
        System.out.println("\nUpdated information:");
        for (Person employee : employees) {
            System.out.println(employee.toString() + ", Salary: $" + ((Worker) employee).calculateSalary());
        }
    }
}
