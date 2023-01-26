package com.example.thisjava.src.ch01.sec06;

public class B {

    public void method() {

        A a = new A();

        a.field1 = 1;
        a.field2 = 2;
        //a.field3 = 3;   // 직접 접근 불가..

        a.method1();
        a.method2();
        //a.method3();    // 직접 접근 불가.
    }
}
