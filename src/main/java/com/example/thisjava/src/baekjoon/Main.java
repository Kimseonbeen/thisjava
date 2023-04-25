package com.example.thisjava.src.baekjoon;

import java.io.*;
import java.util.Scanner;

public class Main {

    public int solution(int n,int m, int[][] arr){
        int answer = 0;

        for(int i = 1; i <= n; i++) {// i 학생
            for(int j = 1; j <= n; j++) {// j 학생
                int cnt = 0;
                for(int k = 0; k < m; k++) {// k번 테스트
                    int pi = 0, pj = 0; // 등수
                    //k번 테스트에서 i번 학생의 등 수인 인덱스(s)를 찾았을 때
                    //k번 테스트에서 j번 학생을 등 수인 인덱스(s)를 찾았을 때
                    for(int s = 0; s<n; s++) {
                        if(arr[k][s]==i) pi = s;
                        if(arr[k][s]==j) pj = s;
                    }// s for
                    //찾은 등 수 에서 i번 학생이 j번 학생보다 등수가 높으면(인덱스가 낮으면 등 수는 높다)
                    if(pi<pj) cnt++;
                }// k for
                //m번의 테스트를 모두 성공하면 i학생과 j학생은 짝꿍이 될 수 있다.
                if(cnt==m){
                    answer++;
                }
            }// j for
        }// i for

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb =new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(n, m, arr));

    }
}

