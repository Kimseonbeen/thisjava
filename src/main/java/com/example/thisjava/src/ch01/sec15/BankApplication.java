package com.example.thisjava.src.ch01.sec15;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {

    private static Account[] arr = new Account[100];

    private static Scanner scanner = new Scanner(System.in);

    public void create() {

        System.out.print("계좌번호 :  ");
        String num = scanner.nextLine();

        System.out.print("계좌주 :  ");
        String name = scanner.nextLine();

        System.out.print("초기 입금액 :  ");
        int money = 0;
        money = Integer.parseInt(scanner.nextLine());

        while (money < 0) {
            System.out.println("금액이 0보다 작을 수 없습니다.");
            System.out.print("초기입금액 :  ");
            money = Integer.parseInt(scanner.nextLine());
        }

        Account account = new Account(num, name, money);

        System.out.println(account.toString());

        save(account);
    }

    public void save(Account account) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = account;
                break;
            }
        }
        System.out.println("계좌가 개설되었습니다.");
    }

    public void list() {
        System.out.println("계좌 목록");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getNum() + "  " + arr[i].getName() + "  " + arr[i].getMoney());
            }
        }
    }

    public void inMoney() {

        // Scanner scanner = new Scanner(System.in);

        System.out.println("예금");

        System.out.print("계좌번호: ");
        String num = scanner.nextLine();

        Account account = findAccount(num);

        if (account == null) {
            System.out.println("계좌번호 다시 입력");
            return;
        }

        System.out.print("예금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        account.setMoney(money);

    }

    private static Account findAccount(String num) {
        Account account = null;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getNum().equals(num)) {
                account = arr[i];
                break;
            }
        }
        return account;
    }


}
