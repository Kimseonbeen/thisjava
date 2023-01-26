package com.example.thisjava.src.ch01.sec15;

import java.util.Scanner;

public class AccountExample {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;
        BankApplication ba = new BankApplication();

        do {
            System.out.println("---------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("---------------------------------------------------");
            System.out.print("선택 >  ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: ba.create();                        break;
                case 2: ba.list();                          break;
                case 3: ba.inMoney();                       break;
                case 5: System.out.println("프로그램 종료");  break;
            }

        } while (choice != 5);


    }
}
