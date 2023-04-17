package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class chapter2to4 {

    /***
     *
     * 1 1 2 3 5 8 13
     */
    public static ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(1);
        answer.add(1);

        for (int i = 2; i < n; i++) {
            int N = answer.get(i - 2) + answer.get(i - 1);
            answer.add(N);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int x : solution(n)) {
            System.out.print(x + " ");
        }
    }
}
