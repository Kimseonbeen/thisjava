package com.example.thisjava.src.ch01.sec15;

public class MemberExample {

    public static void main(String[] args) {

        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong", "12345");

        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 패스워드가 일치하지 않습니다.");
        }
    }



}
