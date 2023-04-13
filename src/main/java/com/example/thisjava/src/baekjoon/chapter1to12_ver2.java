package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class chapter1to12_ver2 {
    public static String solution(int n, String str) {

        String answer = "";

        /***
         *  key point
         *  str을 7개 씩 끊어 냄
         *  substring 사용하여 7개를 뽑아낸다음
         *  substring으로 str을 갱신
         */
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*','0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);     // 갱신
        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        String str = kb.next();
        System.out.println(solution(N, str));
    }
}
