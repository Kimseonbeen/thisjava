package com.example.thisjava.src.ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        SmartTelevision rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();
        rc.search("das");

        SmartTelevision rc1 = new SmartTelevision();

        rc1.search("naver.com");
    }

}
