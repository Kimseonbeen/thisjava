package com.example.thisjava.src.ch01.sec03.exam01;

public class SupersonicAirplane extends AirPlane {

    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    // 메소드 재정의


    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        } else {
            super.fly();
        }
    }
}
