package com.example.thisjava.src.ch01.sec03.exam01;

public class Computer extends Calculator{

    @Override
    public double areaCircle(double r) {
        System.out.println("Computer 객체 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
