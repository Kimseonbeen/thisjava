package com.example.thisjava.src.ch14.sec03.exam01;


import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            System.out.println("λΉνμ");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("λ΅");
            try { Thread.sleep(500);} catch (Exception e) {}
        }

    }
}
