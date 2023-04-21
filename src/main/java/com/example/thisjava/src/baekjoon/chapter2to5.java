package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class chapter2to5 {

    public static int solution(int n) {
        int answer = 0;
        int [] ch = new int[n+1];
        /**
         * ch index value 0
         * 첫번쨰 반복문에서 ch[i] == 0 인 값을 찾고
         * 두번째 반복문에서 i의 배수를 찾아 값을 1으로 변경한다
         *
         */
        for (int i = 2; i <=n; i++) {
            if (ch[i] == 0) {
                answer++;
                System.out.println("i = " + i);
                for (int j = i; j <=n; j=j+i) {
                    System.out.println("j = " + j);
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(solution(n));
    }
}
