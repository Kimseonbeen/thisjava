package com.example.thisjava.src.baekjoon.exam01;

import java.io.IOException;
import java.util.Scanner;

public class chapter1to2 {
    public static String solution(String str) {

        String answer = "";

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)) {
                answer +=  Character.toUpperCase(c);
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
