package com.example.thisjava.src.ch11.sec02;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
      String[] arr = {"100", "1oo", null, "200"};

      for (int i = 0; i <= arr.length; i++) {
          try {
              int value = Integer.parseInt(arr[i]);
              System.out.println("arr [" + i + "] = " + value);
          } catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("배열 인덱스가 초과됌 : " + e.getMessage());
          } catch (NullPointerException | NumberFormatException e) {
              System.out.println("데이터에 문제가 있음 : " + e.getMessage());
          }
      }
    }
}
