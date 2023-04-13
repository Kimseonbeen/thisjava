package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class chapter1to12 {
    public static String solution(int n, String str) {

        String newT = "";
        String[] answer = new String[n];
        String answer2 = "";
        int N = str.length() / n;

        for (int i = 0; i < n; i++) {
            String substring = str.substring(0, 7);
            answer[i] = substring;
            str = str.substring(7);
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length(); j++) {
                if (answer[i].charAt(j) == '#') {
                    newT += "1";
                } else {
                    newT += "0";
                }
            }
            char c = (char) Integer.parseInt(newT, 2);
            answer2 += c;
            newT = "";
        }

        return answer2;
    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        String str = kb.next();
        System.out.println(solution(N, str));
    }
}
