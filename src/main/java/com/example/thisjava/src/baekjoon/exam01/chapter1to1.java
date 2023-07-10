package com.example.thisjava.src.baekjoon.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class chapter1to1 {
    public static int solution(String str, String ch) {

        int answer = 0;
        for (char c : str.toCharArray()) {
            if (ch.equalsIgnoreCase(String.valueOf(c))) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        String ch = kb.nextLine();

        System.out.println(solution(str, ch));

    }
}
