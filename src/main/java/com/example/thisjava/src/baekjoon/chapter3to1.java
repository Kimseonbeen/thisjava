package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class chapter3to1 {
    /**
     n : 4  m : 3
     n : 학생 수
     m : 테스트 횟수

     3 4 1 2    (3,4) / (3,1) / (3,2) / (4,1) / (4,2) / (1,2)
     4 3 2 1    (4,3) / (4,2) / (4,1) / (3,2) / (3,1) / (2,1)
     3 1 4 2    (3,1) / (3,4) / (3,2) / (1,4) / (1,2) / (4,2)

     출력설명

     (3, 1), (3, 2), (4, 2)와 같이 3가지 경우의 (멘토, 멘티) 짝을 만들 수 있다.

     for i = 1 ~ 4  // i 학생
        for j = 1 ~ 4  // j 학생
            for k = 0 ~ 2  // k = 테스트
                for s = 0 ~ 3  // s = 등수
     */
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            // anwer add 후 p1 ++
            if (a[p1] < b[p2]) answer.add(a[p1++]);
            // anwer add 후 p2 ++
            else answer.add(b[p2++]);
        }
        // p1, p2 둘 중 어떤것이 끝났는지 모르기 때문에 while문 두 번
        while (p1 < n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        chapter3to1 T = new chapter3to1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }

        for (int x : T.solution(n, m, a, b)) System.out.println(x + " ");
    }
}
