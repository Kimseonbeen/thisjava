package com.example.thisjava.src.ch01.sec15;


public class Account {

    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;

    private int balance;
    private String num;
    private String name;
    private int money;

    public Account(String num, String name, int money) {
        this.num = num;
        this.name = name;
        this.money = money;
    }


    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money += money;
    }

//    public void setMoney(String num, int money) {
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].getNum().equals(num)) {
//                this.money += money;
//                break;
//            }
//        }
//    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {

        if (balance <= MIN_BALANCE || balance >= MAX_BALANCE) {
            return;
        }

        this.balance = balance;


    }

    @Override
    public String toString() {
        return "Account{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
