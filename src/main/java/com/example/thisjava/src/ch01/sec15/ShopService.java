package com.example.thisjava.src.ch01.sec15;

public class ShopService {

    private static ShopService singleton = new ShopService();

    private ShopService() {};

    public static ShopService getSingleton() {
        return singleton;
    }
}
