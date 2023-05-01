package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class chapter3to2 {
    /**
     * 5
     * 1 3 9 5 2
     * 5
     * 3 2 5 7 8
     * --------
     * 2 3 5
     *
     * a, b 배열을 받은 다음 오름차순 정렬을 함
     * a, b 배열 포인터를 설정하고 포인터 끼리 비교
     * a[p1] < b[p2] 조건을 만족하면 p1을 증가 시킴 ( 오름차순 정렬이 된 상태라 작은 쪽은 더 이상 배열에서 찾을 수 없기 때문)
     *
     */
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0, p2 = 0;
        // Two pointers algorithm
        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2])  {
                answer.add(a[p1]);
                p1++;
                p2++;
            }
            else if (a[p1] < b[p2]) p1++;
            else if (a[p1] > b[p2]) p2++;

        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        chapter3to2 T = new chapter3to2();
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

        for (int x : T.solution(n, m, a, b)) System.out.print(x + " ");
    }
}
