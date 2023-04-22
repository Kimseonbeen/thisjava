package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class chapter2to10 {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    /**
     5
     index 10 13 10 12 15           [0][0] [0][1] [0][2] [0][3] [0][4]
     index 12 39 30 23 11           [1][0] [1][1] [1][2] [1][3] [1][4]
     index 11 25 50 53 15           [2][0] [2][1] [2][2] [2][3] [2][4]
     index 19 27 29 37 27           [3][0] [3][1] [3][2] [3][3] [3][4]
     index 19 13 30 13 19           [4][0] [4][1] [4][2] [4][3] [4][4]

     5
     5 3 7 2 3
     3 7 1 6 1
     7 2 5 3 4
     4 3 6 4 1
     8 7 3 5 2
     */
    public int solution(int n, int[][] arr) {

        int answer = 0;

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    /**
                     * ex) [1][2] -> [i+dx[0][j+dy[0] [i+dx[1]][j+dy[1]] [i+dx[2]][j+dy[2]] -> [0][2] [1][3] [2][2]
                     * ex) [0][0] -> [i+dx[0][j+dy[0] [i+dx[1]][j+dy[1]] [i+dx[2]][j+dy[2]] -> [-1][0] [1][3] [2][2]
                     */
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    // 범위에 벗어나면 if문 조건에 들어가지 않는다.
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;          // 하나의 지점이라도 작으면 break;
                    }
                }
                if (flag) answer ++;        // true면 카운팅한다.
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        chapter2to10 T = new chapter2to10();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
