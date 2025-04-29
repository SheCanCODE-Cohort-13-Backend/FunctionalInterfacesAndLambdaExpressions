package com.practice.interfaces;

public interface Vehicle {
    int MAX_SPEED = 120;

    void start();
    void stop();

    default void honk() {
        System.out.println("Beep beep!");
    }

    static boolean isVehicle(Object obj) {
        return obj instanceof Vehicle;
    }
}
