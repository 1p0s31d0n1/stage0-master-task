package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
        } else {
            boolean isLeap = (year % 400 == 0 || (year % 100 != 0 && (year % 4 == 0)));
            if (month == 2) {
                System.out.println(isLeap ? 29 : 28);
                return;
            }
            if ((month <= 7 && month%2 == 1) || (month > 7 && month%2 == 0)) {
                System.out.println(31);
            } else System.out.println(30);
        }
    }
}
