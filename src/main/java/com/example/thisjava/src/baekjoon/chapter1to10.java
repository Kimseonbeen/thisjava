package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class chapter1to10 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);

        int[] answer = new int[s.length()];

        int p = 1000;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
            }
            answer[i] = p;
            p++;

        }

        p = 1000;

        for (int i = s.length(); i < 0; i--) {
            if (s.charAt(i) == t) {
                p =0;
            }
            answer[i] = p;
            p++;
        }

    }
}
