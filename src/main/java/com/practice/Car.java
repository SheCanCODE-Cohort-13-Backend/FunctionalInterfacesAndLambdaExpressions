package com.practice;

import com.practice.interfaces.Vehicle;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is running");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }
}
