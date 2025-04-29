package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BuiltInPredicate {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Water mellon", "Raspberry");

        // Lambda: Predicate to check if a fruit is red.
        Predicate<String> isRed = fruit -> fruit.equals("Apple") || fruit.equals("Water mellon") || fruit.equals("Raspberry");

        System.out.println("Red fruits:");
        for (String fruit : fruits) {
            if (isRed.test(fruit)) {
                System.out.println(fruit);
            }
        }
    }
}
