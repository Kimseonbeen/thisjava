package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class chapter1to9 {
    public static int solution(String str) {
        int answer = 0;

        /***
         * 'o' ~ '9'
         *  48 ~ 57
         *  char x > 48 && x <= 57
         *
         *  answer = answer * 10 + ( x - 48 )   <-- loop !
         *
         *  g0en2T0s8eSoft -> 208
         *
         *  tge0a1h205er -> 1205
         */

        char[] c = str.toCharArray();

        for (char x : c) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
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
