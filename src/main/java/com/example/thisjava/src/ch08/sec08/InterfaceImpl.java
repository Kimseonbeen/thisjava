package com.example.thisjava.src.ch08.sec08;

public class InterfaceImpl implements InterfaceC {
    @Override
    public void methodA() {
        System.out.println("InterfaceImpl-methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceImpl-methodB() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceImpl-methodC() 실행");
    }
}
