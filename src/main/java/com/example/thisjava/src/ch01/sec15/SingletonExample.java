package com.example.thisjava.src.ch01.sec15;

public class SingletonExample {
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();

        Singleton instance2 = Singleton.getInstance();

        if (instance1 == instance2) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}
