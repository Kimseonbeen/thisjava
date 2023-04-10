package com.example.thisjava.src.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chapter1to1 {
    public static int solution(String str, String ch) {

        int answer = 0;

        // foreach 사용
        // for (x : y) 에서 y는 배열, 컬렉션 객체만 들어올수 있음
        // str.toCharArray() 문자열에 속해있는 문자 배열 객체를 생성해줌
        for (char x : str.toCharArray()) {
            if (x == ch.charAt(0)) {
                answer++;
            }
        }

/*        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch.charAt(0)) {
                answer++;
            }
        }*/

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toLowerCase();
        String ch = br.readLine().toLowerCase();

        System.out.println(solution(str, ch));
    }
}
