package com.example.thisjava.src.ch01.sec06;

public class CarExample {

    public static void main(String[] args) {
        Car car1 = new Car("자가용");
        System.out.println(car1.toString());

        Car car2 = new Car("자가용", "빨강");
        System.out.println(car2.toString());

        Car car3 = new Car("택시", "검정", 200);
        System.out.println(car3.toString());
    }
}
