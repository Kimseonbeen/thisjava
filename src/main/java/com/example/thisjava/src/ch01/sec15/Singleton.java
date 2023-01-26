package com.example.thisjava.src.ch01.sec15;

public class Singleton {

    // private 접근 권한을 갖는 정적 필드 선언과 초기화
    private static Singleton singleton = new Singleton();

    // private 접근 권한을 갖는 생성자 선언
    private Singleton () {}

    // pubilc 접근 권한을 갖는 정적 메소드 선언
    static Singleton getInstance() {
        return singleton;
    }
}
