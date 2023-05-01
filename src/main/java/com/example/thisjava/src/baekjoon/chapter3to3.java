package com.example.thisjava.src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class chapter3to3 {
    /**
     * N(일) = 10, K(매출기록) = 3
     * 10 3
     * 12 15 11 20 25 10 20 19 13 15
     *
     * 이중 for문을 돌게 된다면 시간복잡도는 O(n^2)
     * 그렇게된다면 N은 100,000까지이므로
     * 100,000 30,000 이라는 조건이 주어지면 100,000 x 30,000 이 되서 시간제한이 걸린다.
     *
     * Sliding window
     * 첫 번째 arr[0] ~ arr[2]까지 값을 sum에 저장
     * 그 이후로 sum + arr[i] - arr[i-k] = 38 + arr[3] - arr[0] 이 되서
     * 창문을 하나씩 밀듯이 3개의 더한값을 구할수 있게된다
     * 시간복잡도 O(n) 성립
     *
     */
    public int solution(int n, int k, int[] arr) {

        int answer = 0, sum = 0;
        for (int i = 0; i < k; i++) sum += arr[i];
        answer = sum;
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        chapter3to3 T = new chapter3to3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, k, arr));

    }
}
