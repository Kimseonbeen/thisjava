package com.example.thisjava.src.ch01.sec06;

public class Computer {

    int sum(int ...values) {

        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }
}
