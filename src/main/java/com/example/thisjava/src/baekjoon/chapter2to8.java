package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class chapter2to8 {

    /**
     5
     87 89 92 100 76
     */
    public static int[] solution(int n, int[] arr) {

        int[] answer = new int[n];

        int cnt = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
            cnt = 1;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.println("x = " + x);
        }


    }
}
