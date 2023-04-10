package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class chapter1to5 {
    public static String solution(String str) {
        String answer = "";

        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() -1;

        for (char c : s) {
            String ss = String.valueOf(c);
            while (lt < rt) {
                if (!ss.matches("[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힝|(|)|.|-]*")) {
                    System.out.println("ss : " + ss);
                    char tmp = s[lt];
                    s[lt] = s[rt];
                    s[rt] = tmp;
                }
                lt++;
                rt--;
            }
            String aa = String.valueOf(s);
            answer = aa;

        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
    }
}
