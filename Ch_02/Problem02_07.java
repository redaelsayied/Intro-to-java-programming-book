package Ch_02;

// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * 2.7 (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the maximum number of years and remaining days for the minutes. For simplicity, assume that a year has 365 days. Here is
 * a sample run:
 * Enter the number of minutes: 1000000000
 * 1000000000 minutes is approximately 1902 years and 214 days
 */
public class Problem02_07 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int totalMinutes,totalDays,totalHours,years,days;
        final int MINUTES_TO_HOURS_RATIO=60;
        final int HOURS_PER_DAY=24;
        final int DAYS_PER_YEARDAYS_PER_YEAR=365;

        System.out.println("Enter the number of minutes:");
        totalMinutes=input.nextInt();
        totalHours=totalMinutes/MINUTES_TO_HOURS_RATIO;
        totalDays=totalHours/HOURS_PER_DAY;
        years=totalDays/DAYS_PER_YEARDAYS_PER_YEAR;
        days=totalDays%DAYS_PER_YEARDAYS_PER_YEAR;
        System.out.println("Years: "+years+" Days: "+days);


    }
}
