package com.example.thisjava.src.ch08.sec10;

public class PromotionExample {
    public static void main(String[] args) {

        // 구현 객체 선언
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // 인터페이스 변수 선언
        A a;
        // 변수에 구현 객체 대입
        a = b;  // A <- B (자동 타입 변환)
        System.out.println(a);
        a = d;
        System.out.println(a);
        a = e;
        System.out.println(a);




    }
}
