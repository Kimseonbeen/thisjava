package com.example.thisjava.src.ch01.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("홍길동");

        // Phone phone = new Phone();   // 생성 불가

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
