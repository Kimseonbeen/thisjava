package com.example.thisjava.src.ch01.sec06;

import java.util.Calendar;
import java.util.Scanner;

/** *
 *
 */


public class Hello {
    public static void main(String[] args) {

        Week today = null;

        Calendar cal = Calendar.getInstance();

        int week = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println(week);

        switch (week) {

            case 1: today = Week.SUNDAY;        break;
            case 2: today = Week.MONDAY;        break;
            case 3: today = Week.TUESDAY;       break;
            case 4: today = Week.WEDNESDAY;     break;
            case 5: today = Week.THURSDAY;      break;
            case 6: today = Week.FRIDAY;        break;
            case 7: today = Week.SATURDAY;      break;
        }

        if (today == Week.SUNDAY) {
            System.out.println("soccer");
        } else {
            System.out.println("study");
        }

        System.out.println(" program exit");


    }
}
