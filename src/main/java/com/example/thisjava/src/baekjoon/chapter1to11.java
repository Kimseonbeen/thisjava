package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class chapter1to11 {
    public static String solution(String str) {
        String answer = "";

        str = str + " ";    // 마지막 문자열 비교를 위해서 빈 문자열 삽입

        int cnt = 1;
        for (int i = 0; i < str.length() -1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                if (cnt > 1) {
                    answer += str.charAt(i) + String.valueOf(cnt);
                    cnt = 1;
                } else {
                    answer += str.charAt(i);
                }
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
