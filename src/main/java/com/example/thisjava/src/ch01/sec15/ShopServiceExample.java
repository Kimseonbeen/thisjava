package com.example.thisjava.src.ch01.sec15;

public class ShopServiceExample {

    public static void main(String[] args) {

        ShopService singleton1 = ShopService.getSingleton();
        ShopService singleton2 = ShopService.getSingleton();

        if (singleton1 == singleton2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
