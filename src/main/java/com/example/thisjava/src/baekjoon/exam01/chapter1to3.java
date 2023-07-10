package com.example.thisjava.src.baekjoon.exam01;

import java.io.IOException;
import java.util.Scanner;

public class chapter1to3 {
    public static String solution(String str) {

        String[] arr = str.split(" ");

        String answer = "";
        for (String s : arr) {
            if (answer.length() < s.length()) {
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));

    }
}
