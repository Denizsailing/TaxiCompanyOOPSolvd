package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MainWorker2 {
    //  takes in a Function object and returns it
    public static <T, R> Function<T, R> customFunction1(Function<T, R> func) {
        return func;
    }

    //  takes in a BiFunction object and returns it
    public static <T, U, R> BiFunction<T, U, R> customFunction2(BiFunction<T, U, R> func) {
        return func;
    }

    // 3takes in a Function object and returns it
    public static <T, R> Function<T, R> customFunction3(Function<T, R> func) {
        return func;
    }

    public static void main(String[] args) {
        //  lambda expression that takes in an integer and returns its square
        Function<Integer, Integer> square = x -> x * x;
        //  lambda expression that takes in a string and returns its length
        Function<String, Integer> length = x -> x.length();
        //  lambda expression that takes in two integers and returns their sum
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;

        //customFunction1 to the square function and passing 4 as the input
        System.out.println("Square of 4: " + customFunction1(square).apply(4));
        // customFunction1 to the length function and passing "hello" as the input
        System.out.println("Length of 'hello': " + customFunction1(length).apply("hello"));
        // customFunction2 to the add function and passing 2 and 3 as the inputs
        System.out.println("Addition of 2 and 3: " + customFunction2(add).apply(2, 3));
    }
}
