package com.example.thisjava.src.ch08.sec11;

public class Car {
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    void run() {
        tire1.roll();
        tire2.roll();
    }

}
