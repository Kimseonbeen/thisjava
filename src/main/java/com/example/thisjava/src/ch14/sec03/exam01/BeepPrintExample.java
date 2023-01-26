package com.example.thisjava.src.ch14.sec03.exam01;


import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            System.out.println("비프음");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try { Thread.sleep(500);} catch (Exception e) {}
        }

    }
}
