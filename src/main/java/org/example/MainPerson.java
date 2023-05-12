package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.example.Exception.*;
import org.example.Exception.NoCompanyException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainPerson {
    private static final Logger logger = LogManager.getLogger(MainPerson.class);

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        try {
            people.add(new Employee("deniz", 25, "facebook Inc."));
            people.add(new Driver("gunduz", 35, 20.5));
            people.add(new Employee("justyna", 24, "google"));
            people.add(new Driver("john", 40, 10));

            for (Person p : people) {
                if (p instanceof Employee) {
                    Employee e = (Employee) p;
                    if (e.getCompany() == null) {
                        throw new NoCompanyException("Company name cannot be null");

                    }
                } else if (p instanceof Driver) {
                    Driver d = (Driver) p;
                    if (d.getHourlyRate() < 0 || d.getHourlyRate() > 100) {
                        throw new InvalidHourlyRateException("Invalid hourly rate");

                    }
                    if (d.calculateSalary() < 20000) {
                        throw new InsufficientSalaryException("Salary is insufficient");

                    }
                }
                if (p.getAge() < 0 || p.getAge() > 120) {
                    throw new InvalidAgeException("Invalid age");

                }
                if (p.getName() == null || p.getName().isEmpty() || p.getName().length() > 50) {
                    throw new InvalidNameException("Invalid name");

                }
            }
        } catch (Exception e) {
            logger.error(" exception occurred: ", e);
            return;
        }

        try (FileWriter fw = new FileWriter("output.txt")) {
            for (Person p : people) {
                fw.write(p.toString() + "\n");
            }
        } catch (IOException e) {
            logger.error(" I/O exception occurred: ", e);
        }

    }
}
