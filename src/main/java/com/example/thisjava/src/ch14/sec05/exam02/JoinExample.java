package com.example.thisjava.src.ch14.sec05.exam02;

public class JoinExample {
    public static void main(String[] args) {

        System.out.println("1");

        SumThread sumThread = new SumThread();
        System.out.println("2");
        sumThread.start();
        System.out.println("3");

        try {
            sumThread.join();
            System.out.println("4");
            System.out.println("1~100 합 : " + sumThread.getSum());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("5");


        System.out.println("1~100 합 : " + sumThread.getSum());
    }
}
