package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class chapter2to9 {

    /**
     5
     index 10 13 10 12 15           [0][0] [0][1] [0][2] [0][3] [0][4]
     index 12 39 30 23 11           [1][0] [1][1] [1][2] [1][3] [1][4]
     index 11 25 50 53 15           [2][0] [2][1] [2][2] [2][3] [2][4]
     index 19 27 29 37 27           [3][0] [3][1] [3][2] [3][3] [3][4]
     index 19 13 30 13 19           [4][0] [4][1] [4][2] [4][3] [4][4]
     */
    public static int solution(int n, int[][] arr) {

        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        
        // 가로 세로 의 합 구하기
        for (int i = 0; i < n; i++) {
            sum1=sum2=0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            // if 문을 사용지 않고도 Math.max로 반복할 때마다 최대값을 구할 수 있다.
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        
        // 대각선의 합 구하기
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            sum1 += arr[i][i];              // 왼쪽 대각선 합 구하기
            sum2 += arr[i][n - i - 1];      // 오른쪽 대각선 합 구하기 : [0][4], [1][3] ...
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
}
