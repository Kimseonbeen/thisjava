package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class chapter2to5 {

    public static int solution(int n) {
        int answer = 0;
        int [] ch = new int[n+1];
        for (int i = 2; i <=n; i++) {
            if (ch[i] == 0) {
                answer++;
                System.out.println("i = " + i);
                for (int j = i; j <=n; j=j+i) {
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
