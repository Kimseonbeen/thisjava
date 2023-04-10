package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class chapter1to4 {
    public static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
/*        for (String s : str) {
            // String 객체 : 불변, 변경 할 시 새로운 객체 생성
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }*/

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() -1;

            //     0 1 2 3 4
            // ex) s t u d y

            //     0 1 2 3
            // ex) g o o d
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        System.out.println("solution(n, str): " + solution(n, str));

        for (String s : solution(n, str)) {
            System.out.println(s);
        }
    }
}
