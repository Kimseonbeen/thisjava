package com.example.thisjava.src.ch01.sec10.exam01;

public sealed class Person permits Employee, Manager {
    public String name;

    public void work() {
        System.out.println("하는 일이 결정되지 않았습니다.");
    }

}
