package com.example.thisjava.src.ch01.sec10.exam01;

public class SealedExample {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();

        person.work();
        employee.work();
        manager.work();
        director.work();
    }
}
