package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class chapter3to5 {
    /**
     * 이중포문으로 구할 수 있으나, 시간복잡도 O(n^2)이 되버림..
     * Two Pointer
     * lt, rt
     * sum = lt ~ rt 부분 수열의 합
     *
     *      lt          rt
     *      0   1   2   3   4   5   6   7
     * arr [1] [2] [1] [3] [1] [1] [1] [2]
     *
     *   [7]  == k(6)
     *   sum
     *
     *   sum이 lt ~ rt 부분 수열의 합 보다 클 경우
     *   lt가 가르키는 곳을 빼고 lt를 증가 시킴
     *
     */
    public int solution(int n, int m, int[] arr) {
        // int answer = 0;
        int answer = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < m; rt++) {
            // 더한 뒤 바로 비교
            sum += arr[rt];
            if (sum == n) answer++;

            while (sum >= n) {
                // sum에서 lt가 가르키는 곳을 빼고 또 비교
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        chapter3to5 T = new chapter3to5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = (n / 2) + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        System.out.println(T.solution(n, m, arr));

    }
}
