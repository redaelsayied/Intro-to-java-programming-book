package Ch_03;


// Created By: Reda Elsayed
import java.util.*;

/**
 * **(Science: day of the week) Zeller’s congruence is an algorithm developed by
 * Christian Zeller to calculate the day of the week. The formula is

 * where
 * ■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
 * Wednesday, 5: Thursday, and 6: Friday).
 * ■ q is the day of the month.
 * ■ m is the month (3: March, 4: April, ..., 12: December). January and February
 * are counted as months 13 and 14 of the previous year.
 * ■ j is year
 * 100
 * .
 * ■ k is the year of the century (i.e., year % 100).
 * Note all divisions in this exercise perform an integer division. Write a program
 * that prompts the user to enter a year, month, and day of the month, and displays
 * the name of the day of the week. Here are some sample runs:
 */
public class Problem03_21 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter year: (e.g., 2012): ");
            int year = scanner.nextInt();

            System.out.print("Enter month: 1−12: ");
            int month = scanner.nextInt();

            System.out.print("Enter the day of the month: 1−31: ");
            int day = scanner.nextInt();

            int dayOfWeek = calculateDayOfWeek(year, month, day);

            String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
            String dayName = daysOfWeek[dayOfWeek];

            System.out.println("Day of the week is " + dayName);
        }

        public static int calculateDayOfWeek(int year, int month, int day) {
            if (month < 3) {
                month += 12;
                year--;
            }

            int q = day;
            int m = month;
            int j = year / 100;
            int k = year % 100;

            int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

            return h;
        }
    }
