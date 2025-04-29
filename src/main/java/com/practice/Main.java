package com.practice;

import com.practice.interfaces.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();
        myCar.honk();

        System.out.println("Max speed is: "+Vehicle.MAX_SPEED);

        boolean isVeh = Vehicle.isVehicle(myCar);

        Double guess = Math.random();
    }
}