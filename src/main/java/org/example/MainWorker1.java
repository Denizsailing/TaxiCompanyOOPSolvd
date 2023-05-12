package org.example;

import org.example.Exception.InvalidAgeException;
import org.example.interfaces.IWorker;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainWorker1 {
    public static void main(String[] args) throws InvalidAgeException {
        RegularCustomer regularCustomer = new RegularCustomer("deniz", "deniz@gmail.com");
        NormalIWorker normalWorker = new NormalIWorker("gunduz", 25, 20.0);
        FinancialIWorker financialWorker = new FinancialIWorker("deniz2", 30, 80000.0);

        Predicate<PersonCustomer> customerPredicate = (customer) -> customer.getDiscount() > 0.05;
        Function<RegularCustomer, Double> discountFunction = (customer) -> customer.getDiscount();
        Function<IWorker, Double> salaryFunction = (worker) -> worker.calculateSalary();
        Supplier<RegularCustomer> customerSupplier = () -> new RegularCustomer("", "");
        BiFunction<Person, Integer, Boolean> ageValidator = (person, age) -> person.getAge() >= 18 && person.getAge() <= 65;

        System.out.println("Is the regular customer's discount rate greater than 0.05? " + customerPredicate.test(regularCustomer));
        System.out.println("Regular customer discount rate: " + discountFunction.apply(regularCustomer));
        System.out.println("Normal worker salary: " + salaryFunction.apply(normalWorker));
        System.out.println("Financial worker salary: " + salaryFunction.apply(financialWorker));
        System.out.println("Default regular customer: " + customerSupplier.get());
        System.out.println("Is the normal worker's age valid? " + ageValidator.apply(normalWorker, 25));
        System.out.println("Is the financial worker's age valid? " + ageValidator.apply(financialWorker, 30));
    }
}
