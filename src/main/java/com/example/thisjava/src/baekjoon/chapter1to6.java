package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class chapter1to6 {
    public static String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            int index = str.indexOf(str.charAt(i));

            // i == index 일 때 처음 등장한 알파벳

            if (i == index) {
                answer += str.charAt(i);
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
