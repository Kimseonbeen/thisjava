package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class chapter2to11 {
    /**
     5
     2 3 1 7 3  [0][0]  [1][0]
     4 1 9 6 8  [1][0]  [1][1]
     5 5 2 4 4  [2][0]
     6 5 2 6 7  [3][0]
     8 4 2 2 2  [4][0]

     [0][0] [0][1] [0][2] [0][3] [0][4]
     [1][0] [1][1] [1][2] [1][3] [1][4]
     [2][0] [2][1] [2][2] [2][3] [2][4]
     [3][0] [3][1] [3][2] [3][3] [3][4]
     [4][0] [4][1] [4][2] [4][3] [4][4]

     */
    public int solution(int n, int[][] arr) {

        int answer = 0, max=Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {               // i는 학생번호
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    // arr[1][1] == arr[1][1]
                    // break;
                    // arr[1][1] == arr[2][1]
                    System.out.println("arr[i][k] : arr[" + i + "][" + k  +"] // " + "arr[j][k] : arr[" + j + "][" + k  +"]");
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        chapter2to11 T = new chapter2to11();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[][] = new int[n+1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
