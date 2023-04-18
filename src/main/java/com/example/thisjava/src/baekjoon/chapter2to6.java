package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class chapter2to6 {

    /**
     * 9
     * 32 55 62 20 250 370 200 30 100
     */
    public static ArrayList<Integer> solution(int n, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = arr[i];

            int res = 0;

            while (tmp > 0) {
                int t = tmp % 10;
                System.out.println("t = " + t);
                res = res * 10 + t;
                System.out.println("res = " + res);
                tmp = tmp / 10;
                System.out.println("tmp = " + tmp);
            }
            if (isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }

    private static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
                if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }

    }
}
