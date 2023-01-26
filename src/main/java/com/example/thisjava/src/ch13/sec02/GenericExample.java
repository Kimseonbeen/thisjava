package com.example.thisjava.src.ch13.sec02;

import com.example.thisjava.src.ch08.sec10.B;

public class GenericExample {
    public static void main(String[] args) {

//        HomeAgency homeAgency = new HomeAgency();
//        Home home = homeAgency.rent();
//        home.turnOnLight();
//
//        CarAgency carAgency = new CarAgency();
//        Car car = carAgency.rent();
//        car.run();

        Box box1 = new Box();
        box1.content = "100";

        Box box2 = new Box();
        box2.content = "100";

        Box box3 = new Box();
        box3.content = 100;

        boolean result1 = box1.compare(box2);
        System.out.println("result1 : " + result1);

        boolean result2 = box1.compare(box3);
        System.out.println("result2 : " + result2);
    }
}
