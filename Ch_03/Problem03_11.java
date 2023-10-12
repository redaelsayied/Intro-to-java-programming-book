package Ch_03;

// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * *3.11 (Find the number of days in a month) Write a program that prompts the user
 * to enter the month and year and displays the number of days in the month. For
 * example, if the user entered month 2 and year 2012, the program should display
 * that February 2012 has 28 days. If the user entered month 3 and year 2015, the
 * program should display that March 2015 has 31 days.
 */
public class Problem03_11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the month as an integer from 1 to 12: ");
        int month = in.nextInt();

        System.out.print("Enter the year: ");
        int year = in.nextInt();
        String days = "";

        switch (month) {
            case 1, 10, 3, 5, 8, 12, 7:
                days = "31";
                break;
            case 2:
                days =checkLeap(year);
                break;
            case 4, 6, 11, 9:
                days = "30";
                break;
        }
        System.out.println("The number of days in the month is " + days);
    }
    public static String checkLeap(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return "28";
        else
            return "29";
    }
}
