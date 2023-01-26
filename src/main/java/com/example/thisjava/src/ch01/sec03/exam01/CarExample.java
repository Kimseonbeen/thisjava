package com.example.thisjava.src.ch01.sec03.exam01;

public class CarExample {
    public static void main(String[] args) {

        Car myCar = new Car();

        // Tire 객체 장착
        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
