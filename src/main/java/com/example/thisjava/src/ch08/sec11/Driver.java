package com.example.thisjava.src.ch08.sec11;

public class Driver {
    void drive(Vehicle vehicle) {
        System.out.println(vehicle.getClass().getClassLoader());
        vehicle.run();
    }
}
