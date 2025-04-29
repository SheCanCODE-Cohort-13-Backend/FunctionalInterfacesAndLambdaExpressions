package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class BuiltInConsumer {
    public static void main(String[] args) {
        List<String> guests = Arrays.asList("Alice", "Bod", "Charlie");

        Consumer<String> invite = guest -> System.out.println("Dear " + guest + ", you're invited!");
        for (String guest : guests) {
            invite.accept(guest);
        }
    }

    public static void invite2(String guest) {
        System.out.println("Dear " + guest + ", you're invited!");
    }
}
