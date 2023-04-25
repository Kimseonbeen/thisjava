package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class chapter2to12 {
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
    public int solution(int n, int m, int[][] arr) {

        int answer = 0;
        for (int i = 1; i <= n; i++) {               // i 학생
            for (int j = 1; j <= n; j++) {          // j 학생
            int cnt = 0;
                for (int k = 0; k < m; k++) {       // k번 테스트
                    int pi = 0, pj = 0;             // pi : 멘토, pj : 멘티
                    // k번 테스트에서 i번 학생의 등 수인 인덱스(s)를 찾았을 때
                    // k번 테스트에서 j번 학생의 등 수인 인덱스(s)를 찾았을 때
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }   // s for
                    // 찾은 등 수에서 i번 학생이 j번 학생보다 등수가 높으면
                    if (pi < pj) cnt++;
                }   // k for
                //m번의 테스트를 모두 성공하면 i학생과 j학생은 짝꿍이 될 수 있다.
                if (cnt == m) {
                    answer++;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        chapter2to12 T = new chapter2to12();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(n, m, arr));
    }
}
