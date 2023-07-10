package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class chapter1to7 {
    public static String solution(String str) {
        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(tmp)) answer = "YES";

        /*char[] c = str.toCharArray();
        int lt = 0, rt = str.length() -1;

            while (lt < rt) {
                if (c[lt] == c[rt]) {
                    lt++;
                    rt--;
                    answer = "YES";
                } else {
                    answer = "NO";
                    break;
                }
            }*/

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
    }
}
