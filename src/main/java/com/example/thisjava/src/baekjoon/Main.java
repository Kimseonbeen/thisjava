package com.example.thisjava.src.baekjoon;

import java.io.*;

public class Main {

    public static int solution(String str, String ch) {

        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch.charAt(0)) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toLowerCase();
        String ch = br.readLine().toLowerCase();

        System.out.println(solution(str, ch));
    }
}

