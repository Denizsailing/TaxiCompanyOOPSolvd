package org.example;
import java.util.Comparator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayDeque;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import org.example.Exception.*;

import java.lang.reflect.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {
        // Using CustomLinkedList
        CustomLinkedList<Person> peopleList = new CustomLinkedList<>();
        peopleList.add(new NormalIWorker("deniz", 31, 25));
        peopleList.add(new FinancialIWorker("gunudz", 43, 80000));
        peopleList.add(new CustomerSupport("oyku", 22, 20));
        boolean removed = peopleList.remove(new NormalIWorker("meral", 45, 25));
        System.out.println("Removed Alice from CustomLinkedList: " + removed);

        // Updated list
        System.out.println("CustomLinkedList of people:");
        System.out.println(peopleList);

        // Using HashSet
        Set<Person> peopleSet = new HashSet<>();
        peopleSet.add(new NormalIWorker("deniz", 35, 25));
        peopleSet.add(new FinancialIWorker("gunduz", 45, 80000));
        peopleSet.add(new CustomerSupport("oyku", 28, 20));

        System.out.println("\nHashSet of people:");
        peopleSet.stream()
                .filter(person -> person.getAge() > 30)
                .forEach(System.out::println);

        // Using HashMap
        Map<String, Person> peopleMap = new HashMap<>();
        peopleMap.put("NormalIWorker", new NormalIWorker("deniz", 35, 25));
        peopleMap.put("FinancialIWorker", new FinancialIWorker("gunduz", 45, 80000));
        peopleMap.put("CustomerSupport", new CustomerSupport("oyku", 28, 20));

        System.out.println("\nHashMap of people:");
        peopleMap.forEach((key, value) -> System.out.println(key + ": " + value));

        // Using ArrayDeque
        ArrayDeque<Person> peopleDeque = new ArrayDeque<>();
        peopleDeque.addFirst(new NormalIWorker("ali", 30, 25));
        peopleDeque.addLast(new FinancialIWorker("ayse", 40, 90000));
        peopleDeque.addLast(new CustomerSupport("cemal", 25, 15));

        System.out.println("\nArrayDeque of people:");
        peopleDeque.forEach(System.out::println);

        // Using TreeSet
        TreeSet<Person> peopleTreeSet = new TreeSet<>(Comparator.comparingInt(Person::getAge));
        peopleTreeSet.add(new NormalIWorker("emre", 25, 20));
        peopleTreeSet.add(new FinancialIWorker("fatma", 35, 70000));
        peopleTreeSet.add(new CustomerSupport("gamze", 30, 18));

        System.out.println("\nTreeSet of people:");
        peopleTreeSet.forEach(System.out::println);

        // Reflection - Extracting information
        extractInformation(CustomLinkedList.class);
        extractInformation(HashSet.class);
        extractInformation(HashMap.class);
        extractInformation(ArrayDeque.class);
        extractInformation(TreeSet.class);
    }

    private static void extractInformation(Class<?> clazz) {
        System.out.println("\nClass Information: " + clazz.getSimpleName());

        // Fields
        Field[] fields = clazz.getDeclaredFields();
        System.out.println("Fields:");
        for (Field field : fields) {
            System.out.println("- Name: " + field.getName());
            System.out.println("  Type: " + field.getType().getSimpleName());
            System.out.println("  Modifiers: " + Modifier.toString(field.getModifiers()));
        }
        // Constructors
        Constructor<?>[] constructors = clazz.getConstructors();
        System.out.println("Constructors:");
        for (Constructor<?> constructor : constructors) {
            System.out.println("- Name: " + constructor.getName());
            System.out.println("  Parameters:");
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("  - Name: " + parameter.getName());
                System.out.println("    Type: " + parameter.getType().getSimpleName());
            }
            System.out.println("  Modifiers: " + Modifier.toString(constructor.getModifiers()));
        }

        // Method
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println("- Name: " + method.getName());
            System.out.println("  Return Type: " + method.getReturnType().getSimpleName());
            System.out.println("  Parameters:");
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("  - Name: " + parameter.getName());
                System.out.println("    Type: " + parameter.getType().getSimpleName());
            }
            System.out.println("  Modifiers: " + Modifier.toString(method.getModifiers()));
        }

        // Create object and call method using reflection
        try {
            // Creating object using the default constructor
            Object obj = clazz.getDeclaredConstructor().newInstance();
            System.out.println("\nCreating object using reflection: " + obj.getClass().getSimpleName());

            // Invoking a method using reflection
            Method method = clazz.getDeclaredMethod("someMethod");
            method.setAccessible(true);
            method.invoke(obj);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}