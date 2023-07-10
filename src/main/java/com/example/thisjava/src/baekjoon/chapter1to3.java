package com.example.thisjava.src.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class chapter1to3 {
    public static String solution(String[] str) {

        String answer = "";

        for (String s : str) {
            if (answer.length() < s.length()) {
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String arr[] = new String[st.countTokens()];

        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i] = st.nextToken();
            i++;
        }

        for (String s : arr) {
            System.out.println("s = " + s);
        }

        System.out.println(solution(arr));
    }
}
