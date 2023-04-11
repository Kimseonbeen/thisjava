package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class chapter1to8 {
    public static String solution(String str) {
        String answer = "NO";

        String newStr = str.toUpperCase().replaceAll("[^A-Z]", "");

        String tmp = new StringBuilder(newStr).reverse().toString();

        if (newStr.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
    }
}
