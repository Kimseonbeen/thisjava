package com.example.thisjava.src.ch01.sec03.exam01;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
        Phone phone = new Phone("아이폰", "실버");

        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);

        System.out.println("모델 : " + phone.model);
        System.out.println("모델 : " + phone.color);

    }
}
